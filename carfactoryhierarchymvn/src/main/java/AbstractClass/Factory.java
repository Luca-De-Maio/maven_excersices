package AbstractClass;

import java.util.ArrayList;

public abstract class Factory {
    private String name;
    protected ArrayList<Car> cars;


    public Factory(String nombre) {
        this.name = nombre;
        this.cars = new ArrayList<>();
    }

    public Factory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public abstract Car build();

    public void addPart(Car part){
        this.cars.add(part);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
