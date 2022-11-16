package dio.gof.javapuro.facade.subsistema.crm;

/**
 Facade
 Subsistema CRM
 armazenar em nova base de dados
 @author NetoPaiva
 */

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM: ");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
