package dio.gof.javapuro.strategy;

/**
 classe de contexto da estratégia
 propriedade da Conduta

 Robô pode mudar de estratégia
 mudança definida pelo método SetComportamento
 possibilita as mudanças de estratégia

 Garantia de movimento do Robô
 método público mover
 delega a responsabilidade de movimentação
 para a interface de estratégia Conduta
 pega o comportamento que está atribuído ao Robô
 e faz ele se mover conforme interesse
 @author NetoPaiva
 */

public class Robo {
    private Conduta comportamento;

    public void setComportamento(Conduta comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

}
