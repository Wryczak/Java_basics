package HomePets;
import java.time.LocalDateTime;

public class Cat extends Animal implements Movable {
    private String name;
    private String makeSound;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(" idę " + "tup tup tup ");
    }

    @Override
    void makeSound(String makeSound) {
        this.makeSound = makeSound;
        System.out.println(name + " " + makeSound);
    }

    public void eatMouse() {
        int mouse = LocalDateTime.now().getDayOfMonth();
//        DayOfWeek mouse1 = LocalDate.now().getDayOfWeek();
//        String mouse2 = String.valueOf(mouse);
//        int mouse3 = Integer.parseInt(String.valueOf(mouse2.length()));
//         int mouse4=(mouse2+1)/2;
        System.out.println("Zjadłem " + mouse / 2 + " myszy");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
