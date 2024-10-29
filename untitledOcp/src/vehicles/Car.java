package vehicles;

public class Car implements IVehicleCar{
    private String color;
    private  String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){
        configureVehicleCar(color,year,engine,seats);
    }

    @Override
    public void configureVehicleCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando carro com Interface " + color + " " + engine);

        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os Motores com Interface");
    }

//    public Car(String color, String year, double engine, int seats){
//        this.color = color;
//        this.year = year;
//        this.engine = engine;
//        this.seats = seats;
//    }
//
//    public void configureCar(){
//        System.out.println("Crinado um carro: " + color + " " + year + " " + engine + " com " + seats + " assentos");
//        startVehicle();
//    }
}
