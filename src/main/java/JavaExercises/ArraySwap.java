package JavaExercises;

public class ArraySwap {
    public static void swap(int first, int second, int thrid) {
        int array[] = new int[]{first, second, thrid};
        int array2[] = new int[]{array[2], array[1], array[0]};
        for (int arraytemp : array) {
            System.out.print(" ["+ arraytemp+"] ");
        }
        System.out.println();

        for (int arraytemp2 : array2) {
            System.out.print(" ["+ arraytemp2+"] ");
        }
        System.out.println();
    }
}
