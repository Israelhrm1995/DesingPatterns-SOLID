package br.com.builder.builders;

import br.com.builder.cars.Sport;
import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class SportBuider implements IBuilder {
    private CarType carType;
    private int seats;
    private  Transmission transmission;
    private Engine engine;
    private Color color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Sport getResult(){
        return new Sport(carType, seats, engine, transmission, color);
    }
}