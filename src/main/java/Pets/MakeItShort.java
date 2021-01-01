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
         String digit01 =lineNumber.substring(0,lineNumber.length());
        System.out.println(digit01);

        String digit1 = String.valueOf(lineNumber.charAt(0));
        String digit2 = String.valueOf(lineNumber.charAt(1));
        String digit3 = String.valueOf(lineNumber.charAt(2));
        System.out.println(digit1 + " " + digit2 + " " + digit3);
//      int numberCompiler = Integer.parseInt(lineNumber.);
//      numberCompiler
//        System.out.println(numberCompiler);
    }

    public static void main(String[] args) {
    insertNumber();
    }
}
