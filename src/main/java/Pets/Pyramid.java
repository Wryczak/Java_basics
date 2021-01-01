package Pets;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int i, j, k, l, lineNumber;
        boolean waitingForNumbers = true;
        String check;

        while (waitingForNumbers) {
            System.out.print("Pres Number of line for your Pyramid :");
            Scanner SetLineNumber = new Scanner(System.in);
            lineNumber = SetLineNumber.nextInt();

            i = 1;
            while (i <= lineNumber) {
                j = lineNumber - 1;
                while (j >= i) {
                    System.out.print("0");
                    j--;
                }
                k = 1;
                while (k <= i) {
                    System.out.print("#");
                    k++;
                }
                l = 1;
                while (l <= i - 1) {
                    System.out.print("*");
                    l++;
                }
                i++;
                System.out.println();
            }
            System.out.print("Do you want another Pyramid (Y/N)? ");
            check = SetLineNumber.next();

            if (check.equalsIgnoreCase("Y")) {
                waitingForNumbers = true;
            } else if (check.equalsIgnoreCase("N")) {
                waitingForNumbers = false;
            } else
                System.exit(0);
        }
    }
}