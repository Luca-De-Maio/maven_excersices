package Car;
import AbstractClass.Car;
public class LightComercialVan extends Car{
    private Integer capacity;
    private Integer tare;


    public LightComercialVan(String fuel, String model, Integer year, Integer ratedPower, Integer topSpeed) {
        super(fuel, model, year, ratedPower, topSpeed);
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getTare() {
        return tare;
    }

    public void setTare(Integer tare) {
        this.tare = tare;
    }
}
