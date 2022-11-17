package dio.gof.spring.controller;


import dio.gof.spring.model.Cliente;
import dio.gof.spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *    Desafio Padrões de Projeto com Spring Boot
 *         | RestController (representa a Facade)
 *         — interface simples e coesa (API REST),
 *         que abstrai a complexidade das integrações
 *         (banco de dados e API).
 *
 *     @author NetoPaiva
 */

@RestController
@RequestMapping ("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> busccarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return  ResponseEntity.ok(cliente);
    }

    @PutMapping ("/{id}")
    public  ResponseEntity<Cliente>
        atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
            clienteService.atualizar(id, cliente);
            return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
