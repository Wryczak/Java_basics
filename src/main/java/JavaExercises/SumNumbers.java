package JavaExercises;

public class SumNumbers {
    public static void sum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
