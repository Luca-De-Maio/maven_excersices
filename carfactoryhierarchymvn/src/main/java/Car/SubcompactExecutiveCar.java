package Car;
import AbstractClass.Car;
import Interface.ICar;
import org.apache.log4j.Logger;

public class SubcompactExecutiveCar extends Car implements ICar {
    private String luxury;
    private String ySize;
    private String xSize;
    final Logger LOGGER = Logger.getLogger(SubcompactExecutiveCar.class);


    public SubcompactExecutiveCar(String fuel, String model, Integer year, Integer ratedPower, Integer topSpeed, String luxury, String ySize, String xSize) {
        super(fuel, model, year, ratedPower, topSpeed);
        this.luxury = luxury;
        this.ySize = ySize;
        this.xSize = xSize;
    }

    public SubcompactExecutiveCar() {
        super();
    }

    public String getLuxury() {
        return luxury;
    }

    public void setLuxury(String luxury) {
        this.luxury = luxury;
    }

    public String getySize() {
        return ySize;
    }

    public void setySize(String ySize) {
        this.ySize = ySize;
    }

    public String getxSize() {
        return xSize;
    }

    public void setxSize(String xSize) {
        this.xSize = xSize;
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
