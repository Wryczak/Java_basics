package Pets;

public class TriangleTest {
    public static void generate(int n) {
        for (int c = 0, i = 0; c < n; i++) {
            for (int j = 0; j <= i; j++, c++)
                System.out.print(" " + n);
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        generate(10);

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print("# ");
            System.out.println();
        }
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i > 1 && i < 10 && j > 0 && j < 10) {
                    System.out.print("   ");
                    continue;
                }
                System.out.print(" # ");
            }
            System.out.println();
        }

        for (int i = 10; i > 0; i--) {
            for (int k = i; k > 0; k--)
                System.out.print("  ");
            for (int j = i; j < 10; j++)

                System.out.print("# ");
            System.out.println();
        }
        for (int i = 10; i > 0; i--) {
            for (int k = 0; k < 10; k++)
                System.out.print("0 ");
            for (int j = 10; j > 0; j--)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int k = i; k > 0; k--)
                System.out.print("  ");
            for (int j = i; j < 10; j++)
                System.out.print("# ");
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i > 1 && i < 10 && j % 2 != 0) {
                    System.out.print(" " + j + " ");
                    continue;
                }
                if (i > 1 && i < 10 && j % 2 == 0) {
                    System.out.print(" " + i + " ");
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
