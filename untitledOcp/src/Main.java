import vehicles.Car;
import vehicles.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
//            Vehicle vehicle = new Vehicle("Amarelo", 4, 2.0, "2021");
//            vehicle.car();
            Car  car = new Car("Amarelo", "2021", 2.0, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCCLE) {
//            Vehicle vehicle = new Vehicle(" ", 1, 250, "2022");
//            vehicle.motorcycle();
            Motorcycle motorcycle = new Motorcycle("Azul", "2023", 250);
            motorcycle.configureMotorcycle();
        }

    }
}