package Basics;

public class EX10 {

    public static void main(String[] args) {

        boolean prawda = true;
        boolean fałsz = false;

        if (prawda == fałsz) {
            System.out.println("To się nie wykona dlatego, że warunek if jest fałszywy - prawda nie równa się fałszowi");
            System.out.println("1 = 0 - to nie jest prawda");
        }

        if (prawda != fałsz) {
            System.out.println("Wykonie if dlatego, że warunek if jest prawdziwy prawda jest różna od fałszu");
            System.out.println("1 != 0 ");
        }

        if (prawda == true) {
            System.out.println("prawda jest true  więc to się wykona");
            System.out.println("1 = 1 ");
        }

        if (fałsz == true) {
            System.out.println("If się nie wykona, fałsz nie równa się prawdzie");
            System.out.println("0 = 1 - to nie jset prawda");
        }
    }
}