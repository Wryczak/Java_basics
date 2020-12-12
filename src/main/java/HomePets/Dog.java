package HomePets;

public class Dog extends Animal {
    private String name;
    private String makeSound;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    void makeSound(String makeSound) {
        this.makeSound = makeSound;
        System.out.println(name + " " + makeSound);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
