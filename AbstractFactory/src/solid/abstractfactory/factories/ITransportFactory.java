package solid.abstractfactory.factories;

import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
