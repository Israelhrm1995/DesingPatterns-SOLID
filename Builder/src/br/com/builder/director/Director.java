package br.com.builder.director;

import br.com.builder.builders.IBuilder;
import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMACT);
        builder.setEngine(new Engine(1600));
    }

    public void constructSedanTruck(IBuilder builder){
        builder.setCarType(CarType.TRUK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSport(IBuilder builder){
        builder.setCarType(CarType.SPORT);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(3000));
        builder.setColor(Color.Amarelo);
    }
}
