package Car;
import AbstractClass.Car;

public class SubcompactExecutiveCar extends Car{
    private String luxury;
    private String ySize;
    private String xSize;

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
}
