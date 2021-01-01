package Pets;

public class Tests {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 10000; i++) {
            sum += i;
            count++;
            if (sum > 50000) {
                break;
            }

        }
        System.out.println("First Loop sum " + sum);
        System.out.println("Lap numbers " + count);
        int secondLoopEnd = count;
        int sum2 = 0;
        for (int i = 0; i < secondLoopEnd; i++) {
            sum2 += i;
        }
        System.out.println();
        System.out.println("Second Loop sum " + sum2);

        int sum3 = 0;
        int count1 = 0;
        for (int i = 0; i <= 10000; i++) {
            sum3 += i;
            count1++;
        }
        System.out.println();
        System.out.println("Third Loop sum " + sum3);
        System.out.println("Lap numbers " + count1);

        System.out.println();
        System.out.println("Czwarta pętla");

        int sum4 = 0;
        for (int i = 0; i <= 20; i++) {
            if (i >= 13 && i <= 15) {
                continue;
            }
            sum4 += i;
            System.out.println("zliczone i bez tych z continue " + i);
        }
        System.out.println("Suma w czwartej pętli " + sum4);
        System.out.println();

        System.out.println("Sprawdzenie 4 pętli");
        System.out.println();
        int sum5 = 0;
        int sumWithoutNumbers131415 = 0;
        for (int i = 0; i <= 20; i++) {
//            if (i >= 13 && i <= 15) {
//                continue;
//            }
            sum5 += i;
            sumWithoutNumbers131415 = sum5 - 13 - 14 - 15;
        }
        System.out.println("Pętla 5 - czyli czwarta w całości " + sum5);
        System.out.println("Pętla 5 bez liczb 13, 14, 15  = " + sumWithoutNumbers131415);

        double result;
        result = sum5 * (Math.PI);
        if (result > 0) {
            System.out.println(result);
        }
        double result1 = true ? result : 24_312.312_121_2;
        System.out.println(result1);
        System.out.println();
        System.out.println();

//        WORK BOOK ZADANIA KOŃCOWE
//        WORK BOOK ZADANIA KOŃCOWE
//        WORK BOOK ZADANIA KOŃCOWE


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultPow = j * i;
                if (resultPow < 10) {
                    System.out.print("   ");
                }
                if (resultPow >= 10) {
                    System.out.print("  ");
                }
                System.out.print(resultPow);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultPow = j * i;
                String str = String.format("%5s", "|" + resultPow + "|");
                System.out.print(str);
            }
            System.out.println();
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *");
        }
        int k = 36;
        for (int c = 0, i = 0; c < k; i++) {
            for (int j = 0; j <= i; j++, c++)
                System.out.print("# ");
            System.out.println();
        }
    }
}
