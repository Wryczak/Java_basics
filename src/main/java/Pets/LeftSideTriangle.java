package Pets;
import java.util.Scanner;
public class LeftSideTriangle {
        public static void main(String[] args) {
            int i,j, lineNumber;
            boolean waitingForNumbers=true;
            String cek;
            Scanner SetLineNumber = new Scanner(System.in);
            while (waitingForNumbers){
                System.out.print("Pres Number of line for yours triangle :");
                lineNumber = SetLineNumber.nextInt();
                i=1;
                while (i<=lineNumber){
                    j=1;
                    while (j<=i){
                        System.out.print("* ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                System.out.print("Do you want another traingle (Y/N)? ");
                cek = SetLineNumber.next();
                if (cek.equalsIgnoreCase("Y")){
                    waitingForNumbers = true;
                } else if (cek.equalsIgnoreCase("T")){
                    waitingForNumbers = false;
                } else
                    System.exit(0);
            }
        }
    }
