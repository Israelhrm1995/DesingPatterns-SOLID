package solid.abstractfactory.factories;

import solid.abstractfactory.aircrafts.Airplane;
import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.landvehicles.Car;
import solid.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
