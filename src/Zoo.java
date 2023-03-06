import java.util.ArrayList;

class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge() + ", Food: " + animal.getFood());
        }
    }
}