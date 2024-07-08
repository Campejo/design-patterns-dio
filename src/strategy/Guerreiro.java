package strategy;

public class Guerreiro implements ComandosParaAcoes {
    @Override
    public void andar() {
        System.out.println("Andando...");
    }

    @Override
    public void defender() {
        System.out.println("Levantando escudo!");
    }

    @Override
    public void atacar() {
        System.out.println("Desferindo golpe de espada");
    }

    @Override
    public void pular() {
        System.out.println("Pulando...");
    }

    @Override
    public void mudarDirecao(Direcao direcao) {
        System.out.println(String.format("Virando para a %s", direcao));
    }
}
