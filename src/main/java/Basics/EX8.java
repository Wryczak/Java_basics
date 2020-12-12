package Basics;

public class EX8 {
    public static void main(String[] args) {
        int x = 20;
        int y = 9;
        int z = x %= y;
//        reszta z dzielenia x/y to 2 dlatego, że:
//        9*2 = 18; a 20-18=2


        System.out.println("Reszta z dzielenia modulo  " + z);
    }
}
