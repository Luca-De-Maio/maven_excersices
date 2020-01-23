package Car;
import FactoryClass.AClassFactory;
import FactoryClass.VClassFactory;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = Logger.getLogger(Main.class);
        AClassFactory aClass = new AClassFactory("A Class Mercedes");
        VClassFactory vClass = new VClassFactory("V Class Mercedes");
        SubcompactExecutiveCar sce = aClass.build();
        sce.Start();
        sce.Stop();

        LightComercialVan lcv = vClass.build();
        lcv.Start();
        lcv.Stop();
        vClass.build();

        LOGGER.info(aClass.toString());
        LOGGER.info(vClass.toString());

    }
}
