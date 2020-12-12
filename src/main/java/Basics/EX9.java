package Basics;

public class EX9 {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        if (x == y) {
            System.out.println("x jest równe y");
//        nie wykona się jest to fałsz 10 nie jest równe 5
        }

        if (x != y) {
            System.out.println("x jest różne y");
            System.out.println("to się wykona gdyż 10 jest różne od 5");
        }
    }
}
