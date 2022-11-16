package dio.gof.javapuro.facade;

/**
 teste de funcionamento Facade
 @author NetoPaiva
 */

public class RunFacade {
    public static void main(String[] args) {

        //Facade

        Facade facade =new Facade();
        facade.migrarCliente("Margarida", "49035-020");
    }
}

/*
    Resultado do Teste Padrão Facade (Java Puro)
        saída no terminal

        Cliente salvo no sistema de CRM:
        Margarida
        49035-020
        Aracaju
        SE

        Process finished with exit code 0
*/