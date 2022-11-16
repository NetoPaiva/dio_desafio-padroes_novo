package dio.gof.javapuro.strategy;

/**
 interface de estratégia
 define o comportamento do Robô
 "Conduta" é interface que define a estratégia
 e tem o método "mover" (ação de se mover)
 @author NetoPaiva
 */

public interface Conduta {
    void mover();
}
