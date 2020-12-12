package Pets;

public class Cat {
    private String name;
    private Integer mouseCounter;

    public Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    public Cat(String name, Integer mouseCounter) {
        this.name = name;
        this.mouseCounter = mouseCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMouseCounter(Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
    }

    public Integer getMouseCounter() {
        return this.mouseCounter;
    }

    public void makeSound() {
        System.out.println(name + " goes meow");

    }

    public void eatMouse() {
        this.mouseCounter++;
//         this.mouseCounter =  this.mouseCounter + 1;
//        w domu zrobiłem to zależnie od dni miesiąca

        System.out.println("Zjadłem " + mouseCounter + " myszy");

    }


}
