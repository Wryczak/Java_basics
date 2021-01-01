package Pets;

public class Reducer {
    public static void main(String[] args) {
        Reducer reducer = new Reducer();
        String numberToReduce = "123456789";
        int reducedValue = reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }
    public int reduce(String number) {
        return 100;
    }
}
