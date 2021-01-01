package Pets;

public class InvertedTiangleEx2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
//                tu należy wstawić while i<10 i-- j>=i j++
                if (i > 1 && i<10 && j > 0 && j <= 10) {
                    System.out.print("   ");
                    System.out.print(i+",");
                    System.out.print(j);
                    continue;
                }
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
