import br.com.builder.builders.CarBuilder;
import br.com.builder.builders.SportBuider;
import br.com.builder.builders.TruckBuilder;
import br.com.builder.cars.Car;
import br.com.builder.cars.Sport;
import br.com.builder.cars.Truck;
import br.com.builder.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructSedanTruck(truckBuilder);

        SportBuider sportBuilder = new SportBuider();
        director.constructSport(sportBuilder);

        Car car = builder.getresult();
        Truck truck = truckBuilder.getResult();
        Sport sport = sportBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso !");
        System.out.println("Caminhão: " + truck.result());
        System.out.println("Carro sport: " + sport.result());

    }
}