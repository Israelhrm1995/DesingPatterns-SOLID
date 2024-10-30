package solid.abstractfactory.app;

import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.factories.ITransportFactory;
import solid.abstractfactory.landvehicles.ILandVehicle;
import solid.abstractfactory.seacar.IBoat;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }

}
