package br.com.bridge.transmissions;

import br.com.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na Transmiss�o!");
    }

    public void comments(){
        System.out.println("Comentarios liberados na live");
    }


}
