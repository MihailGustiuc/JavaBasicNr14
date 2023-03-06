public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant elephant = new Elephant("Dumbo", 5, "Grass");
        Wolf wolf = new Wolf("Akela", 6, "Meat");
        Lion lion = new Lion("Mufasa", 7, "Meat");
        Jaguar jaguar = new Jaguar("Bagheera", 9, "Meat");
        Zebra zebra = new Zebra("Marty", 10, "Grass");

        zoo.addAnimal(elephant);
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);
        zoo.addAnimal(jaguar);
        zoo.addAnimal(zebra);

        zoo.printAnimals();
    }
}




