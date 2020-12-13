package geometry;

public class Circle implements Figure{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }
}