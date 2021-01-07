package Pets;

public class NoName {
    public static void main(String[] args) {
        int lev=0;
       long basics=1000;
       int life =100;
       int bloodPoints=100;

        for (long i = 1000; i < 1_000_000_000_000L; i=basics+(basics/10)) {
            basics=i;
            lev++;
            System.out.println(lev);
            System.out.println(i);
        }
    }
}
