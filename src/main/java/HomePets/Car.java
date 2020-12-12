package HomePets;

public class Car implements Movable {
    private String theCarBrand;

    public Car(String theCarBrand) {
        this.theCarBrand = theCarBrand;
    }

    @Override
    public void move() {
        System.out.println(theCarBrand + " jadę");
    }

    @Override
    public String toString() {
        return "Car{" +
                "theCarBrand='" + theCarBrand + '\'' +
                '}';
    }
}
