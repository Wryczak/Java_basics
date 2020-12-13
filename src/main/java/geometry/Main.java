package geometry;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.12,5.43);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle (3.18, 6.19);
        System.out.println(triangle.getArea());

        Circle circle = new Circle(3.12);
        System.out.println(circle.getArea());

        System.out.println("Exercise 12");
        List<Figure> figures = new LinkedList<>();
        figures.add(rectangle);
        figures.add(triangle);
        figures.add(circle);

        double result = AreaCounter.countArea(figures);
        System.out.println(result);
        AreaCounter.checkArea(50D,figures);
    }
}
