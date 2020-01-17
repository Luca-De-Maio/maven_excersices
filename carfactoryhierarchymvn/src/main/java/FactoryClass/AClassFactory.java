package FactoryClass;

import AbstractClass.Factory;
import Car.Part;
import Car.SubcompactExecutiveCar;

public class AClassFactory extends Factory {

    public AClassFactory(String nombre) {
        super(nombre);
    }

    public AClassFactory(){
        super();
    };

    @Override
    public String toString() {
        return "AClassFactory{" +
                "cars=" + cars +
                '}';
    }

    @Override
    public void build() {
        Part door = new Part(1, "SmartDoor", "doors smaller than a regular car ");
        Part chassis = new Part(2, "SmartChassis", "chassis smaller than a regular car ");
        Part tires = new Part (3, "tires", "tires smaller for use of a small car");
        SubcompactExecutiveCar sce = new SubcompactExecutiveCar("petrol", "Smart", 2010, 1000, 299,"medium luxury", "2", "3");
        sce.addPart(door);
        sce.addPart(chassis);
        sce.addPart(tires);
        this.getCars().add(sce);
    }
}
