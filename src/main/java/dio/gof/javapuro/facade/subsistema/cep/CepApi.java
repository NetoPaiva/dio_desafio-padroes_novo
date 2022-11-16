package dio.gof.javapuro.facade.subsistema.cep;

/**
 Facade
 Subsistema API CEP
 recuperar dados faltantes a partir do CEP
 - cidade
 - estado
 @author NetoPaiva
 */

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Aracaju";
    }

    public  String recuperarEstado(String cep) {
        return "SE";
    }
}
