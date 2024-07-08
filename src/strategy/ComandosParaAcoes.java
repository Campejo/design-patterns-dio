package strategy;

public interface ComandosParaAcoes {

    void andar();
    void defender();
    void atacar();
    void pular();
    void mudarDirecao(Direcao direcao);
}
