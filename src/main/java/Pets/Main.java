package Pets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mruczek");
        Cat cat2 = new Cat("Puszek");
        Cat cat3 = new Cat("Filemon");
//        cat1.makeSound();
//        cat2.makeSound();
//        cat3.makeSound();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat:cats) {
            cat.makeSound();

        }

        cat1.eatMouse();
        cat1.eatMouse();
        cat1.eatMouse();

        Dog dog1 = new Dog("Burek");
        Dog dog2 = new Dog("Azor");
        Dog dog3 = new Dog("Reks");

        dog1.makeSound();
        dog2.makeSound();
        dog3.makeSound();

        System.out.println("EX 5");

        List<Animal> animals= new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        for (Animal animal:animals) {
            animal.makeSound();
        }
    }
}
