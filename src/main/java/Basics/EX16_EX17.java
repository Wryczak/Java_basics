package Basics;

public class EX16_EX17 {
    public static void main(String[] args) {
        float bmi = 29.1f;
        if (bmi > 30.0){
            System.out.println("Otylosc.");
        } else if (bmi >= 25.0 && bmi <= 30.0) {
            System.out.println("Nadwaga.");
        } else if (bmi >=18.5 && bmi < 25.0){
            System.out.println("Waga prawidlowa.");
        } else {
            System.out.println("Niedowaga.");
        }
    }
}