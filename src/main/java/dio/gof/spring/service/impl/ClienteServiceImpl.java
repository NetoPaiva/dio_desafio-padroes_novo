package dio.gof.spring.service.impl;

import dio.gof.spring.model.Cliente;
import dio.gof.spring.model.ClienteRepository;
import dio.gof.spring.model.Endereco;
import dio.gof.spring.model.EnderecoRepository;
import dio.gof.spring.service.ClienteService;
import dio.gof.spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *    Desafio Padrões de Projeto com Spring Boot
 *         | Implementação da Strategy (ClienteService)
 *         que poderá ser injetada pelo Spring (Autowired).
 *         | Desta maneira, esta classe é semelhante ao Singleton,
 *         a parte fundamental do sistema.
 *
 *     @author NetoPaiva
 */

@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: injeta componentes do Spring (@Autowired)
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    // Strategy - Implementar métodos definidos na interface.
    // Facade - Abstrair integrações com subsistemas (interface simplificada).

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Busca todos os Clientes
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //Buscar cliente por ID
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
        // poderia haver uma regra para o caso de cliente não existir
    }

    @Override
    public void inserir(Cliente cliente) {
        // Verificar se endereço do cliente já existe pelo CEP
        // Caso não exista, integrar com ViaCEP e persistir o reotrno.
        // Inserir Cliente, vinculando Endereço (novo ou existente)
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente pelo ID
        clienteRepository.deleteById(id);

    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se endereço do cliente já existe pelo CEP
        String cep = cliente.getEnderco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Se não existir, integrar com ViaCEP, persistir reotrno.
            Endereco novoEnndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEnndereco);
            return novoEnndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando Endereço (novo ou existente)
        clienteRepository.save(cliente);
    }
}
