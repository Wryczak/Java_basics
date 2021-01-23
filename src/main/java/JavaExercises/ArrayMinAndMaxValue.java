package JavaExercises;

public class ArrayMinAndMaxValue {
    public static void lookForValue(int... values) {

        int out_it = values[0];
        for (int numb : values) {
            if (numb < out_it) {
                out_it = numb;
            }
        }
        System.out.println(out_it);

        int min = values[0];
        for(int i =0; i < values.length; i++){
            if(values[i]< min)
                min = values[i];
        }
        System.out.println(min);

        int minimum=values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum=values[i];
            }
        }
        System.out.println(minimum);

        int tempMinimum = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            int firstValue = values[i];
            int nextValue = values[i+1];
            if (nextValue < firstValue) {
                tempMinimum = nextValue;
                firstValue=values[i];
                System.out.println("to jest niby next value"+nextValue);
            }

            System.out.println("First value " + firstValue + " pętla nr " + i);
            System.out.println("nextValue " + nextValue + " pętla nr " + i);
            System.out.println("Temporary minimum = " + tempMinimum);
            System.out.println();
        }

    }


//        for (int i = 0; i < values.length - 1; i++) {
//            min = values[i];
//            tempMin = values[i + 1];
//            System.out.println("min " + min + " pętla nr " + i);
//            System.out.println("Tempmin " + tempMin + " pętla nr " + i);
//            if (tempMin < min) {
//                 int minimum = tempMin;
//                System.out.println("minimum = " + minimum);
//            }
//        }
}
