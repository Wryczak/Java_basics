package geometry;

public class Rectangle implements Figure {
    private Double length;
    private Double height;

    public Rectangle(Double length, Double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return length * height;
    }

}
