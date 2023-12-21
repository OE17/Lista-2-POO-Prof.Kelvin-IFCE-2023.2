public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Au Au");
    }

    void correr() {
        System.out.println("O cachorro está correndo.");
    }
}