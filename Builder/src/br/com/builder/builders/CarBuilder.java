package br.com.builder.builders;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class CarBuilder implements IBuilder{
    private CarType type;
    private int seats;
    private Engine engine;

    @Override
    public void setCarType(CarType type) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setEngine(Engine engine) {

    }
}
