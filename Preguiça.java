public class Preguiça extends Animal {

    public Preguiça(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Zzzz");
    }

    void subirEmArvores() {
        System.out.println("A preguiça está subindo em uma árvore.");
    }
}