package br.com.designpattern.factory.vehicles;

public class Bicycle implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda de bicicleta");
    }
}
