package dio.gof.javapuro.singleton;

/**
 Singleton "apressado"
 @author NetoPaiva
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
