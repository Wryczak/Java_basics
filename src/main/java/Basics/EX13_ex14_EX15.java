package Basics;

public class EX13_ex14_EX15 {
    public static void main(String[] args) {
        float bodyTemp = 34.6F;
        if (bodyTemp > 37.5) {
            System.out.println("Masz gorączkę");
        } else if (bodyTemp > 35.0) {
            System.out.println("Jesteś zdrowy");
        } else {
            System.out.println("Masz hipotermię");
        }
    }
}