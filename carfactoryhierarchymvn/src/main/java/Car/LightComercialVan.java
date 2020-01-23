package Car;
import AbstractClass.Car;
import Interface.ICar;
import org.apache.log4j.Logger;

public class LightComercialVan extends Car implements ICar {
    private Integer capacity;
    private Integer tare;
    final Logger LOGGER = Logger.getLogger(LightComercialVan.class);

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

    @Override
    public void Start() {
        LOGGER.info("Car Starting...");
    }

    @Override
    public void Stop() {
        LOGGER.info("Car Stopping");

    }
}
