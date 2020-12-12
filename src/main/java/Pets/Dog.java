package Pets;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {

        System.out.println(name + " woff woff");
    }

}
