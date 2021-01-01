package Pets;

public class Shapes {
    public static void main(String[] args) {
        int i, j;
        System.out.println("\nShape 1\n");

        for (i = 1; i <= 4; i++) {

            for (j = 1; j < i; j++) {

                System.out.print("*");

            }

            for (j = i; j <= 5; j++) {

                System.out.print(" ");

            }

            System.out.println();

        }

        for (i = 1; i <= 5; i++) {

            for (j = i; j < 5; j++) {

                System.out.print("*");

            }

            for (j = 1; j <= i; j++) {

                System.out.print(" ");

            }

            System.out.println();

        }

        System.out.println("\nShape 2\n");

        for (i = 1; i <= 4; i++) {

            for (j = 1; j < i; j++) {

                System.out.print(" ");

            }

            for (j = i; j <= 5; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        for (i = 1; i <= 5; i++) {

            for (j = i; j < 5; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println("\nShape 3\n");

        for (i = 1; i <= 4; i++) {

            for (j = i; j < 5; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        for (i = 1; i <= 5; i++) {

            for (j = 1; j < i; j++) {

                System.out.print(" ");

            }

            for (j = i; j <= 5; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println("\nShape 4\n");

        int n, x;

        for (i = 6; i >= 1; i--) {

            for (n = 1; n < i; n++) {

                System.out.print(" ");

            }

            for (x = 6; x >= i; x--) {

                System.out.print("*");

            }

            for (j = i; j < 6; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
