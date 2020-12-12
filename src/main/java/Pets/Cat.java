package Pets;

import lombok.Getter;
import lombok.Setter;

public class Cat {
    @Getter
    @Setter
    private String name;

    public Cat(String name) {
        this.name = name;

    }
        public void  makeSound() {
            System.out.println(name+" goes meow");

        }
    }
