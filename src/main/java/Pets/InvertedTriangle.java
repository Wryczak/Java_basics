package Pets;
import java.util.Scanner;
public class InvertedTriangle {
        public static void main(String[] args) {
            int i,j,k,  lineNumber;
            boolean waitingForNumbers=true;
            String check;
            Scanner SetLineNumber = new Scanner(System.in);

            while (waitingForNumbers){
                System.out.print("Pres Number of line for yours triangle :");
                lineNumber = SetLineNumber.nextInt();

                i=1;
                while(i<= lineNumber){
                    k= lineNumber;

                    while(k>i){
                        System.out.print("  ");
                        k++;
                    }

                    j=1;
                    while(j<=i){
                        System.out.print("* ");
                        j++;
                    }

                    i++;
                    System.out.println();
                }

                System.out.print("Do you want another traingle (Y/N)? ");
                check = SetLineNumber.next();

                if (check.equalsIgnoreCase("Y")){
                    waitingForNumbers = true;
                } else if (check.equalsIgnoreCase("N")){
                    waitingForNumbers = false;
                } else
                    System.exit(0);
            }
        }
    }
