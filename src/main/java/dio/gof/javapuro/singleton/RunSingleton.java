package dio.gof.javapuro.singleton;

/**
 Singleton "testando variáveis de padrão"
 @author NetoPaiva
 */

public class RunSingleton {
    public static void main(String[] args) {

// Testes relacionados ao Design Pattern

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

    }
}

/*
    Teste de saída no terminal do Padrão Singleton

        dio.gof.javapuro.singleton.SingletonLazy@179d3b25
        dio.gof.javapuro.singleton.SingletonLazy@179d3b25
        dio.gof.javapuro.singleton.SingletonEager@5d099f62
        dio.gof.javapuro.singleton.SingletonEager@5d099f62
        dio.gof.javapuro.singleton.SingletonLazyHolder@49c2faae
        dio.gof.javapuro.singleton.SingletonLazyHolder@49c2faae

        Process finished with exit code 0
*/
