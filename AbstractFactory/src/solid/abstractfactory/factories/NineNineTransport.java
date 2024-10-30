package solid.abstractfactory.factories;

import solid.abstractfactory.aircrafts.Airplane;
import solid.abstractfactory.aircrafts.Helicopter;
import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.landvehicles.Car;
import solid.abstractfactory.landvehicles.ILandVehicle;
import solid.abstractfactory.landvehicles.Motorcycle;
import solid.abstractfactory.seacar.Boat;
import solid.abstractfactory.seacar.IBoat;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
