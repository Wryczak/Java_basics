package Pets;

import java.util.Scanner;

public class MakeItShort {

    public static void insertNumber() {
        String lineNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        lineNumber = scanner.nextLine();
        long numberCompiler = Long.parseLong(lineNumber);
        System.out.println(numberCompiler);
        long numberLenght = lineNumber.length();
        long loopDigitStarter;
        long sum = 1;
        for (long i = 1; i <= numberLenght; i++) {
            loopDigitStarter = Integer.parseInt(String.valueOf(lineNumber.charAt((int) (i - 1))));
            System.out.print("Digit " + i + " from left to right is :[" + loopDigitStarter + "]" + " * temporary sum is:  "+loopDigitStarter +"*"+ sum + "=");
            sum *= loopDigitStarter;
            System.out.println(sum);
            System.out.println("Compiled number: " + sum);

        }
        System.out.println("Numbers of Digits is: "+ numberLenght);
        System.out.println("Number after compilation: " + sum);

//        String digit01 = lineNumber.substring(0, lineNumber.length());
//        System.out.println(digit01);

//        String digit1 = String.valueOf(lineNumber.charAt(0));
//        String digit2 = String.valueOf(lineNumber.charAt(1));
//        String digit3 = String.valueOf(lineNumber.charAt(2));
//        System.out.println(digit1 + " " + digit2 + " " + digit3);
//      int numberCompiler = Integer.parseInt(lineNumber.);
//      numberCompiler
//        System.out.println(numberCompiler);
    }

    public static void main(String[] args) {
        insertNumber();
    }
}
