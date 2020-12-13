package geometry;

import java.util.List;

public class AreaCounter {

    public static Double countArea(List<Figure> figures){
        Double sumArea = 0.0;
        for (Figure figure: figures){
            sumArea = sumArea + figure.getArea();
        }
        return sumArea;
    }

    public static boolean checkArea (double area, List<Figure> figures) {
        if (countArea(figures) > area) {
            System.out.println("Za mało farby");
            return false;
        }
        System.out.println("Farby jest wystarczająco");
        return true;
    }
}
