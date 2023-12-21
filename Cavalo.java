public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Iiiiih");
    }

    void correr() {
        System.out.println("O cavalo está correndo.");
    }
}