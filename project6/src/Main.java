public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        animal.flee();
        animal.hunt();
        bird.flee();
        bird.hunt();
        cat.flee();
        cat.hunt();
        wolf.flee();
        wolf.hunt();

    }
}