package HomePets;

public class Vet {
    private Cat cat;
    private Dog dog;
    private Cat[] cats;
    private Dog[] dogs;
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void sayHello(Cat cat) {
        System.out.println("Witaj Mruczek");
    }

    public void sayHello(Dog dog) {
        System.out.println("Witaj Psiaku");
    }

    public void sayHello(Dog[] dogs, Cat[] cats) {
        this.dogs = dogs;
        this.cats = cats;
        for (Dog dogs1 : dogs) {
            System.out.println("Witaj Psiaku " + dogs1);
        }
        for (Cat cats1 : cats) {
            System.out.println("Witaj Mruczku  " + cats1);
        }
    }
}
