package arrays;

public class Main {
    public static void main(String[] args) {
        Array myList = new Array();
        myList.addElemList(2,3,4,5,6);
        System.out.println(myList.listLength());
        myList.addElemList(7,8);
        System.out.println(myList.listLength());
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        myList.printList();

    }
}
