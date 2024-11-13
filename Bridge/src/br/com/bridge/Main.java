package br.com.bridge;

import br.com.bridge.platforms.FacebookLive;
import br.com.bridge.platforms.IPlatform;
import br.com.bridge.platforms.TwitchTV;
import br.com.bridge.platforms.YouTube;
import br.com.bridge.transmissions.AdvancedLive;
import br.com.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
    }

    public static void startLive(IPlatform platform){
        /*System.out.println("... Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}