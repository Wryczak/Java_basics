package HomePets;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Cat cat = new Cat("Franek");
        cat.makeSound("Miau");
        cat.eatMouse();
        Cat cat1 = new Cat("Ryszard");
        cat1.makeSound("PffPff");
        System.out.println();
        Cat cat2 = new Cat("Kudłata");
        cat2.makeSound("Mrrrr");
        Cat cat3 = new Cat("Lala");
        cat3.makeSound("Miau Miau");

        Cat cats[] = new Cat[]{cat, cat1, cat2, cat3};

        for (Cat catss : cats) {
            catss.makeSound("Mrauu - daj jeść człowiek");
        }

        Dog dog = new Dog("Burek");
        dog.makeSound("woof woof");
        Dog dog1 = new Dog("Azor");
        dog1.makeSound("hał hał");
        Dog dog2 = new Dog("Puszek");
        dog2.makeSound("wrrrr wrrr");
        Dog dog3 = new Dog("Gutek");
        dog3.makeSound("Stefan daj gryza");

        Dog dogs[] = new Dog[]{dog, dog1, dog2, dog3};
        for (Dog dogs1 : dogs) {
            dogs1.makeSound("woof woof");
        }

        Animal animals[] = new Animal[]{cat, cat1, cat2, dog, dog1, dog2};
        for (Animal animals1 : animals) {
            animals1.makeSound("jestem głodny " + "człowiek daj jeść");
        }

        Car car = new Car("Mercedes");
        car.move();
        cat.move();

        Movable[] movable = new Movable[]{cat, cat1, car};
        for (Movable temp : movable) {
            System.out.println(temp);
        }

        Vet vet = new Vet("Dr House");
        vet.sayHello(cat);
        vet.sayHello(dog);

        vet.sayHello(dogs, cats);

    }
}
