package Zadanie2;

import java.util.ArrayList;
import java.util.Random;

public class MainSendingApp {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Receiver> receivers = new ArrayList<>();
        receivers.add(new Receiver("John smith", "john@gmail.com", "123-456-789", new PreferredGB()));
        receivers.add(new Receiver("Adam Zulc", "adam@gmail.com", "333-454-989", new PreferredDE()));
        receivers.add(new Receiver("Jan Kowalski", "jan@gmail.com", "987-654-321", new PreferredPL()));

        ArrayList<Ad> ads = new ArrayList<>();
        ads.add(new Ad("Lorem Ipsum", new SMS()));
        ads.add(new Ad("Lorem Ipsum", new Email()));
        ads.add(new Ad("Lorem Ipsum", new VoiceMessage()));

        SendingApp sending = new SendingApp(receivers.get(rnd.nextInt(3)), ads.get(rnd.nextInt(3)));

        System.out.println("get random receiver: " + sending.receiver.getName());
        System.out.println("get random ad: " + sending.ad.getContent());
        System.out.println(sending.translateToPreferredLanguage());
        sending.sendAd();

    }
}
