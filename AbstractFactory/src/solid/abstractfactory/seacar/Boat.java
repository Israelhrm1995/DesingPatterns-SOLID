package solid.abstractfactory.seacar;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a rota maritima!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos passageiros e o mar esta calmo.");
    }
}
