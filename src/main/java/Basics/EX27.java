package Basics;

import java.util.Scanner;

public class EX27 {
    static void ex27() {
        System.out.print("Podaj liczbę: ");
        Scanner myScan = new Scanner(System.in);
        int number = myScan.nextInt();
        System.out.println("Wpisana liczba: " + number);
        if (number > 200) {
            System.out.println("Twoja liczba jest większa od 200");
        } else if (number > 100) {
            System.out.println("Twoja liczba jest większa od 100 ale mniejsza od 200");
        } else {
            System.out.println("Twoja liczba jest mniejsza od 100");
        }
        System.out.println("Koniec metody");
    }

    public static void main(String[] args) {
        ex27();
    }
}
