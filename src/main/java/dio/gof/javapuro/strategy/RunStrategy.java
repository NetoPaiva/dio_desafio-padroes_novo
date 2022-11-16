package dio.gof.javapuro.strategy;

/**
 Demonstração do funcionamento do Robô com as suas instâncias de Conduta

 Criação do Robô
 new Robo()

 Definição de comportamento do Robô
 normal — setComportamento(normal)
 defensivo — setComportamento(defensivo)
 agressivo — setComportamento(agressivo)

 Realizar movimentação do Robô
 robo.mover()
 — movimento normal: 2 vezes
 — afastamento defensivo: 1 vez
 — impulso agressivo 3 vezes

 @author NetoPaiva
 */

public class RunStrategy {
    public static void main(String[] args) {

        // Strategy Java Puro

        Conduta normal = new ComportamentoNormal();
        Conduta defensivo = new ComportamentoDefensivo();
        Conduta agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}

/*
    Teste de movimentação do Padrão Strategy
    Resultado de saída no terminal

        movimento normal do Robô!
        movimento normal do Robô!
        afastamento defensivo do Robô!
        impulso agressivo do Robô!
        impulso agressivo do Robô!
        impulso agressivo do Robô!

        Process finished with exit code 0
*/
