package geometry;

public class Triangle implements Figure{
    private Double height;
    private Double base;

    public Triangle (Double height,Double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public Double getArea () {
        return height*base/2;
    }

}