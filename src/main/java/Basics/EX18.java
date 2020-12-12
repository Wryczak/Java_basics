package Basics;

public class EX18 {
    public static void main(String[] args) {
        String name = "Mike";
        switch (name) {
            case "Mike":
                System.out.println("Hello Mike");
                break;
            case "Kate":
                System.out.println("Hello Kate");
                break;
            default:
                System.out.println("Hello someone");
        }
    }
}