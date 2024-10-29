import solid.abstractfactory.app.Application;
import solid.abstractfactory.factories.ITransportFactory;
import solid.abstractfactory.factories.NineNineTransport;
import solid.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;
        String company = "99";

        if (company == "uber"){
            factory = new UberTransport();
        }else {
            factory = new NineNineTransport();
        }

        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {

        Application app = configureApplication();
        app.startRoute();

    }
}