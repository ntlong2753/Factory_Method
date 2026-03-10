public class Main {
    public static void main(String[] args) {
        Animal a = AnimalFactory.createAnimal("cat");
        a.speak();
        Animal b = AnimalFactory.createAnimal("dog");
        b.speak();
    }
}