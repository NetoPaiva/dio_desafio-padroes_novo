package dio.gof.spring.service;

import dio.gof.spring.model.Cliente;

/**
 *    Desafio Padrões de Projeto com Spring Boot
 *         | Definição do Padrão Strategy no domínio do Cliente.
 *         Interface permite múltiplas implementações.
 *     @author NetoPaiva
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar (Long id);
}
