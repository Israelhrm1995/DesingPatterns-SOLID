public class Vehicle {
    private String color;
    private  String year;
    private double engine;
    private int seats;

    public Vehicle(String color, int seats, double engine, String year) {
        this.color = color;
        this.seats = seats;
        this.engine = engine;
        this.year = year;
    }

    void car(){
        System.out.println("Crinado um carro: " + color + " " + year + " " + engine + " com " + seats + " assentos");
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: " + year + " " + engine + " cilindradas ");
    }

    void startVehicle(){
        System.out.println("Ligando os Motores");
    }
}
