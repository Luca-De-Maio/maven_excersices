package FactoryClass;
import Car.LightComercialVan;
import AbstractClass.Factory;
import Car.Part;

public class VClassFactory extends Factory {

    public VClassFactory(String nombre) {
        super(nombre);
    }

    @Override
    public void build() {
        Part door = new Part(1, "Big doors for a big van", "doors larger than a regular car ");
        Part chassis = new Part(2, "VanChassis", "chassis prepared to large amounts of weights ");
        Part tires = new Part (3, "tires", "tires bigger for use of a big van");
        LightComercialVan lcv = new LightComercialVan("electric", "2000", 2014, 200, 300);
        lcv.addPart(door);
        lcv.addPart(chassis);
        lcv.addPart(tires);
        this.getCars().add(lcv);
    }

    @Override
    public String toString() {
        return "VClassFactory{" +
                "cars=" + cars +
                '}';
    }
}
