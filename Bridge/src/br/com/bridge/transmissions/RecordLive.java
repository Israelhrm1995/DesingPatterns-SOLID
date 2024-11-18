package br.com.bridge.transmissions;

import br.com.bridge.platforms.IPlatform;

public class RecordLive extends Live{

    public RecordLive(IPlatform platform){
        super.platform = platform;
    }

    public void redord(){
        System.out.println("Iniciando Gravação !");
    }

}
