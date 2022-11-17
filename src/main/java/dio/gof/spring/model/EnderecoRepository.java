package dio.gof.spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *    Desafio Padrões de Projeto com Spring Boot
 *         | Repository Endereço
 *         - interface de acesso a dados.
 *     @author NetoPaiva
 */

// CrudRepository é uma Strategy
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
