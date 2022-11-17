package dio.gof.spring.service.impl;

import dio.gof.spring.model.Cliente;
import dio.gof.spring.model.ClienteRepository;
import dio.gof.spring.model.EnderecoRepository;
import dio.gof.spring.service.ClienteService;
import dio.gof.spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
