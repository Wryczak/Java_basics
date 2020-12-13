package Date;

import java.util.HashMap;
import java.util.Map;

public class DataConverter {
    private Map<Integer,String>dayNames;

    public DataConverter() {
        this.dayNames= new HashMap<>();
        initDays();
    }

    private void initDays() {
        this.dayNames.put(1,"Monday");
        this.dayNames.put(2,"Tuesday");
        this.dayNames.put(3,"Wednesday");
        this.dayNames.put(4,"Thursday");
        this.dayNames.put(5,"Friday");
        this.dayNames.put(6,"Saturday");
        this.dayNames.put(7,"Sunday");
    }

    public void getDayName(int day) {
        System.out.println("Day name is " + this.dayNames.get(day));
    }

}
