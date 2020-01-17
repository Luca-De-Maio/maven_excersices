package AbstractClass;
import Car.Part;
import java.util.ArrayList;

public abstract class Car {
    private String fuel;
    private String model;
    private Integer year;
    private Integer ratedPower;
    private Integer topSpeed;
    private ArrayList<Part> parts;

    public Car(String fuel, String model, Integer year, Integer ratedPower, Integer topSpeed) {
        this.fuel = fuel;
        this.model = model;
        this.year = year;
        this.ratedPower = ratedPower;
        this.topSpeed = topSpeed;
        this.parts = new ArrayList<>();
    }

    public Car() {
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(Integer ratedPower) {
        this.ratedPower = ratedPower;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public void addPart(Part part){
        this.parts.add(part);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel='" + fuel + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", ratedPower=" + ratedPower +
                ", topSpeed=" + topSpeed +
                ", parts=" + parts +
                '}';
    }
}
