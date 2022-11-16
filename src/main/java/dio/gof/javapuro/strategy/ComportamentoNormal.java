package dio.gof.javapuro.strategy;


/**
 classe de implementação da interface Conduta
 Variação do Comportamento: Normal
 método mover
 visualização da açõo: "movimento normal do Robô!"
 @author NetoPaiva
 */

public class ComportamentoNormal implements Conduta{

    @Override
    public void mover() {
        System.out.println("movimento normal do Robô!");

    }
}
