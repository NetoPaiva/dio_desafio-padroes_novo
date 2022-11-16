package dio.gof.javapuro.facade;

import dio.gof.javapuro.facade.subsistema.cep.CepApi;
import dio.gof.javapuro.facade.subsistema.crm.CrmService;

/**
 Facade
 criar interface
 recuperar dados
 migrar clientes para nova base de dados
 @author NetoPaiva
 */

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
