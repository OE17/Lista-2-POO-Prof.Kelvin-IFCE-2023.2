public class Principal {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", 5);
        Cavalo horse = new Cavalo("Spirit", 8);
        Preguiça sloth = new Preguiça("Sid", 3);

        Veterinário vet = new Veterinário();

        vet.examinar(dog);
        vet.examinar(horse);
        vet.examinar(sloth);
    }
}