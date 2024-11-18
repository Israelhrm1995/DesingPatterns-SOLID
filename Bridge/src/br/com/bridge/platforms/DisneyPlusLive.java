package br.com.bridge.platforms;

public class DisneyPlusLive implements IPlatform{

    public DisneyPlusLive() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação");
    }
}
