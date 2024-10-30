package solid.abstractfactory.factories;

import solid.abstractfactory.aircrafts.IAircraft;
import solid.abstractfactory.landvehicles.ILandVehicle;
import solid.abstractfactory.seacar.IBoat;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
