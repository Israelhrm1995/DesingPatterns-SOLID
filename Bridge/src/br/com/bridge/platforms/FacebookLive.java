package br.com.bridge.platforms;

public class FacebookLive implements IPlatform{

    public FacebookLive() {
        configureRMTP();
        System.out.println("Facebook: Transmiss�o Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta Autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplica��o");
    }
}
