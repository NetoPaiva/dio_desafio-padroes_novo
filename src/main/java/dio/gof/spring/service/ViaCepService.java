package dio.gof.spring.service;

import dio.gof.spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *    Desafio Padrões de Projeto com Spring Boot
 *         | Cliente HTTP
 *         - criado com OpenFeign,
 *         para consumo da API do ViaCep.
 *         @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 *         @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 *     @author NetoPaiva
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
