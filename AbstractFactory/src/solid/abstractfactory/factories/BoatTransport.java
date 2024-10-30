package solid.abstractfactory.factories;

import solid.abstractfactory.aircrafts.Airplane;
import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.landvehicles.Car;
import solid.abstractfactory.landvehicles.ILandVehicle;
import solid.abstractfactory.seacar.Boat;
import solid.abstractfactory.seacar.IBoat;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
