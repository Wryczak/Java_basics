package Basics;

public class EX24_EX25 {
    static void exercise24() {
        System.out.println("Start metody exercise24");
        String[] names = new String[3];
        names[0] = "Ala";
        names[1] = "Krzyś";
        names[2] = "Bartek";
        System.out.println("Długość tablicy:" + names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    static void exercise25() {
        String[] names = new String[]{"John", "Mike", "Kate"};
        for (String name : names) {        //String name = "John"; itd
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Start programu");
        exercise24();
        exercise25();
    }
}