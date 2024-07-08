import strategy.Direcao;
import strategy.Guerreiro;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.andar();
        guerreiro.atacar();
        guerreiro.mudarDirecao(Direcao.DIREITA);
        guerreiro.andar();
        guerreiro.defender();
        guerreiro.pular();
    }
}