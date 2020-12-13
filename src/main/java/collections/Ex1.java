package collections;

public class Ex1 {
    private int[] array;

    public Ex1() {
        array = new int[10];
    }

    public Ex1(int size) {
        array = new int[size];
    }

    public int[] addArray() {

        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }

        return array;
    }

    public void printArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public void printArraySize() {
        System.out.println("The array size is: " + array.length);
    }

    public int getArraySize() {
        return array.length;
    }

    public int[] mulitplication(int mul) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= mul;
        }
        return array;
    }
}