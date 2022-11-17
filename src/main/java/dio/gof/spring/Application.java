package dio.gof.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *		Etapa 2 - Desafio Padrões de Projeto
 *		Java com Spring Boot
 *		Estrutura básica gerada no Spring Initializr
 *		utilizando os módulos
 *			- JPA
 *			- Web
 *			- H2 Database
 *			- OpenFeign (adicionado manulamente).
 *
 *		@aythor NetoPaiva
*/

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
