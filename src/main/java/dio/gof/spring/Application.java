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
 *		@author NetoPaiva
*/

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
Teste de saída no terminal

/usr/lib/jvm/java-17-openjdk-amd64/bin/java -javaagent:/usr/lib/idea-IC-222.4345.14/lib/idea_rt.jar=34005:/usr/lib/idea-IC-222.4345.14/bin -Dfile.encoding=UTF-8 -classpath /home/emcasa/Documentos/ _cursos_hd2/dio_ifood__java_beginners/0_repositorio-git/dio.desafio_padroes/target/classes:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.7.5/spring-boot-starter-data-jpa-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.7.5/spring-boot-starter-aop-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/spring-aop/5.3.23/spring-aop-5.3.23.jar:/home/emcasa/.m2/repository/org/aspectj/aspectjweaver/1.9.7/aspectjweaver-1.9.7.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.7.5/spring-boot-starter-jdbc-2.7.5.jar:/home/emcasa/.m2/repository/com/zaxxer/HikariCP/4.0.3/HikariCP-4.0.3.jar:/home/emcasa/.m2/repository/org/springframework/spring-jdbc/5.3.23/spring-jdbc-5.3.23.jar:/home/emcasa/.m2/repository/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:/home/emcasa/.m2/repository/jakarta/persistence/jakarta.persistence-api/2.2.3/jakarta.persistence-api-2.2.3.jar:/home/emcasa/.m2/repository/org/hibernate/hibernate-core/5.6.12.Final/hibernate-core-5.6.12.Final.jar:/home/emcasa/.m2/repository/org/jboss/logging/jboss-logging/3.4.3.Final/jboss-logging-3.4.3.Final.jar:/home/emcasa/.m2/repository/net/bytebuddy/byte-buddy/1.12.18/byte-buddy-1.12.18.jar:/home/emcasa/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/home/emcasa/.m2/repository/org/jboss/jandex/2.4.2.Final/jandex-2.4.2.Final.jar:/home/emcasa/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/home/emcasa/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.1.2.Final/hibernate-commons-annotations-5.1.2.Final.jar:/home/emcasa/.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.7/jaxb-runtime-2.3.7.jar:/home/emcasa/.m2/repository/org/glassfish/jaxb/txw2/2.3.7/txw2-2.3.7.jar:/home/emcasa/.m2/repository/com/sun/istack/istack-commons-runtime/3.0.12/istack-commons-runtime-3.0.12.jar:/home/emcasa/.m2/repository/com/sun/activation/jakarta.activation/1.2.2/jakarta.activation-1.2.2.jar:/home/emcasa/.m2/repository/org/springframework/data/spring-data-jpa/2.7.5/spring-data-jpa-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/data/spring-data-commons/2.7.5/spring-data-commons-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/spring-orm/5.3.23/spring-orm-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-context/5.3.23/spring-context-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-tx/5.3.23/spring-tx-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-beans/5.3.23/spring-beans-5.3.23.jar:/home/emcasa/.m2/repository/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar:/home/emcasa/.m2/repository/org/springframework/spring-aspects/5.3.23/spring-aspects-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.7.5/spring-boot-starter-web-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter/2.7.5/spring-boot-starter-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot/2.7.5/spring-boot-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.7.5/spring-boot-autoconfigure-2.7.5.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.7.5/spring-boot-starter-logging-2.7.5.jar:/home/emcasa/.m2/repository/ch/qos/logback/logback-classic/1.2.11/logback-classic-1.2.11.jar:/home/emcasa/.m2/repository/ch/qos/logback/logback-core/1.2.11/logback-core-1.2.11.jar:/home/emcasa/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.17.2/log4j-to-slf4j-2.17.2.jar:/home/emcasa/.m2/repository/org/apache/logging/log4j/log4j-api/2.17.2/log4j-api-2.17.2.jar:/home/emcasa/.m2/repository/org/slf4j/jul-to-slf4j/1.7.36/jul-to-slf4j-1.7.36.jar:/home/emcasa/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/home/emcasa/.m2/repository/org/yaml/snakeyaml/1.30/snakeyaml-1.30.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.7.5/spring-boot-starter-json-2.7.5.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.13.4.2/jackson-databind-2.13.4.2.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.13.4/jackson-annotations-2.13.4.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.13.4/jackson-core-2.13.4.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.13.4/jackson-datatype-jdk8-2.13.4.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.13.4/jackson-datatype-jsr310-2.13.4.jar:/home/emcasa/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.13.4/jackson-module-parameter-names-2.13.4.jar:/home/emcasa/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.7.5/spring-boot-starter-tomcat-2.7.5.jar:/home/emcasa/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.68/tomcat-embed-core-9.0.68.jar:/home/emcasa/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.68/tomcat-embed-el-9.0.68.jar:/home/emcasa/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.68/tomcat-embed-websocket-9.0.68.jar:/home/emcasa/.m2/repository/org/springframework/spring-web/5.3.23/spring-web-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-webmvc/5.3.23/spring-webmvc-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-expression/5.3.23/spring-expression-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/cloud/spring-cloud-starter-openfeign/3.1.5/spring-cloud-starter-openfeign-3.1.5.jar:/home/emcasa/.m2/repository/org/springframework/cloud/spring-cloud-starter/3.1.5/spring-cloud-starter-3.1.5.jar:/home/emcasa/.m2/repository/org/springframework/cloud/spring-cloud-context/3.1.5/spring-cloud-context-3.1.5.jar:/home/emcasa/.m2/repository/org/springframework/security/spring-security-rsa/1.0.11.RELEASE/spring-security-rsa-1.0.11.RELEASE.jar:/home/emcasa/.m2/repository/org/bouncycastle/bcpkix-jdk15on/1.69/bcpkix-jdk15on-1.69.jar:/home/emcasa/.m2/repository/org/bouncycastle/bcprov-jdk15on/1.69/bcprov-jdk15on-1.69.jar:/home/emcasa/.m2/repository/org/bouncycastle/bcutil-jdk15on/1.69/bcutil-jdk15on-1.69.jar:/home/emcasa/.m2/repository/org/springframework/cloud/spring-cloud-openfeign-core/3.1.5/spring-cloud-openfeign-core-3.1.5.jar:/home/emcasa/.m2/repository/io/github/openfeign/form/feign-form-spring/3.8.0/feign-form-spring-3.8.0.jar:/home/emcasa/.m2/repository/io/github/openfeign/form/feign-form/3.8.0/feign-form-3.8.0.jar:/home/emcasa/.m2/repository/commons-fileupload/commons-fileupload/1.4/commons-fileupload-1.4.jar:/home/emcasa/.m2/repository/org/springframework/cloud/spring-cloud-commons/3.1.5/spring-cloud-commons-3.1.5.jar:/home/emcasa/.m2/repository/org/springframework/security/spring-security-crypto/5.7.4/spring-security-crypto-5.7.4.jar:/home/emcasa/.m2/repository/io/github/openfeign/feign-core/11.10/feign-core-11.10.jar:/home/emcasa/.m2/repository/io/github/openfeign/feign-slf4j/11.10/feign-slf4j-11.10.jar:/home/emcasa/.m2/repository/com/h2database/h2/2.1.214/h2-2.1.214.jar:/home/emcasa/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.jar:/home/emcasa/.m2/repository/jakarta/activation/jakarta.activation-api/1.2.2/jakarta.activation-api-1.2.2.jar:/home/emcasa/.m2/repository/org/springframework/spring-core/5.3.23/spring-core-5.3.23.jar:/home/emcasa/.m2/repository/org/springframework/spring-jcl/5.3.23/spring-jcl-5.3.23.jar dio.gof.spring.Application

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.5)

2022-11-17 15:35:03.819  INFO 31818 --- [           main] dio.gof.spring.Application               : Starting Application using Java 17.0.5 on emcasa with PID 31818 (/mnt/7f4b8034-4432-46b3-8bc6-36d6b2203363/_cursos_/dio_ifood__java_beginners/0_repositorio-git/dio.desafio_padroes/target/classes started by emcasa in /mnt/7f4b8034-4432-46b3-8bc6-36d6b2203363/_cursos_/dio_ifood__java_beginners/0_repositorio-git/dio.desafio_padroes)
2022-11-17 15:35:03.833  INFO 31818 --- [           main] dio.gof.spring.Application               : No active profile set, falling back to 1 default profile: "default"
2022-11-17 15:35:08.196  INFO 31818 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-11-17 15:35:08.425  INFO 31818 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 188 ms. Found 2 JPA repository interfaces.
2022-11-17 15:35:08.915  INFO 31818 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=e8212204-8f9b-3cf7-b393-6d7bf7b91d0c
2022-11-17 15:35:10.017  INFO 31818 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-11-17 15:35:10.050  INFO 31818 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-11-17 15:35:10.051  INFO 31818 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.68]
2022-11-17 15:35:10.523  INFO 31818 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-11-17 15:35:10.523  INFO 31818 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6516 ms
2022-11-17 15:35:11.089  INFO 31818 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-11-17 15:35:11.487  INFO 31818 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-11-17 15:35:11.633  INFO 31818 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-11-17 15:35:11.782  INFO 31818 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.12.Final
2022-11-17 15:35:12.206  INFO 31818 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-11-17 15:35:12.441  INFO 31818 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2022-11-17 15:35:13.246  INFO 31818 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-11-17 15:35:13.255  INFO 31818 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-11-17 15:35:13.902  WARN 31818 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-11-17 15:35:14.738  INFO 31818 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-11-17 15:35:14.781  INFO 31818 --- [           main] dio.gof.spring.Application               : Started Application in 13.189 seconds (JVM running for 20.551)
2022-11-17 15:35:26.987  INFO 31818 --- [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2022-11-17 15:35:26.988  INFO 31818 --- [ionShutdownHook] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2022-11-17 15:35:27.001  INFO 31818 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2022-11-17 15:35:27.010  INFO 31818 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Process finished with exit code 130 (interrupted by signal 2: SIGINT)

 */
