package OOP_1mz;

import lombok.Getter;
import lombok.Setter;

public class Engine {
    private Double capicity;
    @Getter
    @Setter
    private Integer horsepower;
    private Double fuelConsumption;

//    EX29
    public Engine(Double capicity,Integer horsepower, Double fuelConsumption) {
        this.capicity=capicity;
        this.horsepower=horsepower;
        this.fuelConsumption=fuelConsumption;
    }
//    EX30 & 31
    public void setCapicity(Double capicity) {
        this.capicity=capicity;
    }

    public Double getCapicity() {
        return this.capicity;
    }
}
