package Basics;

public class EX28_30 {

    static void helloPrinter() {
        System.out.println("Hello");
    }

    static void namePrinter() {
        String name = "Krzysiek";
        System.out.println("Hello " + name);
    }

    static String Ex30(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        helloPrinter();
        namePrinter();
        System.out.println(Ex30("Kinga"));
    }
}