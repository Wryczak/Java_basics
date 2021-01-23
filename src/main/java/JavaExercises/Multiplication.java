package JavaExercises;

public class Multiplication {

    public static void multiply(int factor1) {
        for (int i = 1; i <= 10; i++) {
            int ratio;
            ratio = factor1 * i;
            System.out.println(factor1+" x "+i+ " ="+ratio);
        }
    }
}
