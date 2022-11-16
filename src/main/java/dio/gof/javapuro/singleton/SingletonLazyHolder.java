package dio.gof.javapuro.singleton;

/**
 Singleton "proprietário preguiçoso"
 encapsular instância em classe estática interna (InstanceHolder)

 fonte de referência para Lazy Holder
 @see <a href="https://stackoverflow.com/a/24018148">Referência do Lazy Holder</a>

 @author NetoPaiva
 */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instancia;

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazyHolder();
        }
        return instancia;
    }
}
