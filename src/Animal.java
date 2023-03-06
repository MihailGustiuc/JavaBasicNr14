
class Animal {
    private String name;
    private int age;
    private String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age, String food) {
        super(name, age, food);
    }
}

class Wolf extends Animal {
    public Wolf(String name, int age, String food) {
        super(name, age, food);
    }
}

class Lion extends Animal {
    public Lion(String name, int age, String food) {
        super(name, age, food);
    }
}

class Jaguar extends Animal {
    public Jaguar(String name, int age, String food) {
        super(name, age, food);
    }
}

class Zebra extends Animal {
    public Zebra(String name, int age, String food) {
        super(name, age, food);
    }
}

