package br.com.bridge;

import br.com.bridge.platforms.*;
import br.com.bridge.transmissions.AdvancedLive;
import br.com.bridge.transmissions.RecordLive;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
        startLive(new DisneyPlusLive());
    }

    public static void startLive(IPlatform platform){
        /*System.out.println("... Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        RecordLive recordLive = new RecordLive(platform);
        recordLive.redord();
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}