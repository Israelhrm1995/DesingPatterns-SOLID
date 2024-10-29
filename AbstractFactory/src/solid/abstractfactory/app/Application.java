package solid.abstractfactory.app;

import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.factories.ITransportFactory;
import solid.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }

}
