package Basics;

import java.util.Scanner;

public class EX26 {
    static void ex26 () {
        System.out.println("Podaj imię: ");
        Scanner myScan = new Scanner(System.in);
        String line = myScan.nextLine();
        System.out.println("Wpisane imię: " + line);
    }
    public static void main(String[] args) {
        ex26();
    }
}