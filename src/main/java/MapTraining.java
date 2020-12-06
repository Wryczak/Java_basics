import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void mapTrain() {

        String name1 = "Franek";
        String name2 = "Dusia";
        String name3 = "Ryszard";

        Map<Integer, String> names = new HashMap<>();

        names.put(1, name1);
        names.put(2, name2);
        names.put(3, name3);

        printMap(names);
        System.out.println(names.size());

        names.put(1, name2);
printMap(names);
        System.out.println(names.size());
    }

    public static void printMap(Map<Integer, String> mapNames) {

        for (Map.Entry<Integer, String> entry : mapNames.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}