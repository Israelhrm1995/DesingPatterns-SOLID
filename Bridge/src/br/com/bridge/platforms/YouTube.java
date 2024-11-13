package br.com.bridge.platforms;

public class YouTube implements IPlatform{

    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: Transmiss�o Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplica��o");
    }
}
