package br.com.bridge.transmissions;

import br.com.bridge.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando Transmissão!");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
