package Pets;
import java.util.Scanner;
public class NumberCompiler {
    private long loopDigitStarter;
    private long sum;
    private String lineNumber;
    private long numberLenght;
    NumberCompiler() {
        insertNumber();
    }
    public long insertNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        lineNumber = scanner.nextLine();
        return Long.parseLong(lineNumber);
    }
    public long reducerLoop() {
        numberLenght = lineNumber.length();
        System.out.println("Number of Digits is: " + numberLenght);
        sum = 1;
        for (long i = 1; i <= numberLenght; i++) {
            loopDigitStarter = Integer.parseInt(String.valueOf(lineNumber.charAt((int) (i - 1))));
            System.out.print("Digit " + i + " from left to right is :[" + loopDigitStarter + "]" + " * temporary sum is:  " + loopDigitStarter + "*" + sum + "=");
            sum *= loopDigitStarter;
            System.out.println(sum);
            System.out.println("Compiled number: " + sum);
        }
        System.out.println("Number of Digits was: " + numberLenght);
        System.out.print("Number after compilation: " + sum);
        return sum;
    }
    public long UntilLessThen10() {
        lineNumber = String.valueOf(sum);
        numberLenght = lineNumber.length();
        System.out.println(" New Number of Digits is: " + numberLenght);
        long temporaryLoopStarter = Long.parseLong(lineNumber);
        long sum1 = 1;
        long temporarySum = 1;
        while (temporaryLoopStarter > 10) {
            for (long i = 1; i <= numberLenght; i++) {
                loopDigitStarter = Integer.parseInt(String.valueOf(lineNumber.charAt((int) (i - 1))));
                System.out.print("Digit " + i + " from left to right is :[" + loopDigitStarter + "]" + " * temporary sum is:  " + loopDigitStarter + "*" + sum1 + "=");
                sum1 *= loopDigitStarter;
                System.out.println(sum1);
                System.out.println("Compiled number: " + sum1);
            }
            System.out.println();
            System.out.println("Number of Digits was: " + " [" + numberLenght + "]");
            System.out.print("Number after compilation: " + " [" + sum1 + "]");
            temporaryLoopStarter = sum1;
            lineNumber = String.valueOf(sum1);
            sum1 = temporarySum;
            numberLenght = lineNumber.length();
            System.out.println(" New Number of Digits is: " + numberLenght);
            System.out.println();
        }
        if (sum1 >= 1) {
            sum1=0;
            System.out.println(sum1);
        }
        System.out.println(numberLenght);
        return sum1;
    }
    public static void main(String[] args) {
        NumberCompiler numberCompiler = new NumberCompiler();
        numberCompiler.reducerLoop();
        numberCompiler.UntilLessThen10();
    }
}