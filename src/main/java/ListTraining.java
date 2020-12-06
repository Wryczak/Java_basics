import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTraining {
    public static void trainList() {
        String name1 = "Kunegunda";
        String name2 = "Kasia";
        String name3 = "Piotrek";

        List<String> names = new LinkedList<>();
//        List<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);

        System.out.println(names.size());
        names.add(name1);
        System.out.println(names.size());


    }
}
