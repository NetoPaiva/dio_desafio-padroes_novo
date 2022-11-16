package dio.gof.javapuro.singleton;

/**
 Singleton "preguiçoso"
 @author NetoPaiva
 */

public class SingletonLazy {

    public static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
