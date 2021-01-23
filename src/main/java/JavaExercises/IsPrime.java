package JavaExercises;

public class IsPrime {
    public static void checkIsPrme(int num) {
        boolean isPrime;
        if (num < 2) isPrime = false;
        else isPrime = true;
        ;
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("jest to liczba pierwsza");
        else System.out.println("nie jest to liczba pierwsza");
    }
}
