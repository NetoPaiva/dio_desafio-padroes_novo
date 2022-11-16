package dio.gof.javapuro.strategy;


/**
 classe de implementação da interface Conduta
 Variação do Comportamento: Normal
 método mover
 visualização da açõo: "movimento normal do Robô!"
 @author NetoPaiva
 */

public class ComportamentoAgressivo implements Conduta{

    @Override
    public void mover() {
        System.out.println("impulso agressivo do Robô!");

    }
}
