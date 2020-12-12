package Basics;

public class EX7 {
    public static void main(String[] args) {
        int x = 20;
        int y = 9;
        int i = x / y;
        float z;
        z = (float) x / y;
//        liczba jest niecałkowita 2.222... po zrzutowaniu na  float będzie widoczna
//       część ułamkowa

        System.out.println("Dzielenie zmiennych typu całkowitego bez rzutowania " + i);
        System.out.println("Dzielenie zmiennych typu całkowitego z rzutowaniem na float " + z);
    }
}
