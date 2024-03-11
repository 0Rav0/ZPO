package Zadanie2;

import java.util.Random;

public class MainAdvertisement {
    public static void main(String[] args) {
        Random rnd = new Random();
        Advertisement randomAdForRandomPerson = new Advertisement(rnd.nextInt(999), rnd.nextInt(100), new PreferredGB(), new SMS());

        System.out.println("randomAdForRandomPerson");
        System.out.println("PersonId "+randomAdForRandomPerson.getPersonId());
        System.out.println("AdId "+randomAdForRandomPerson.getAdId());
        randomAdForRandomPerson.translateToPreferredLanguage();
        randomAdForRandomPerson.sendAd();

        randomAdForRandomPerson.setPreferredLanguage(new PreferredPL());
        System.out.println("\n");
        randomAdForRandomPerson.translateToPreferredLanguage();
        randomAdForRandomPerson.sendAd();

        randomAdForRandomPerson.setSendMethod(new VoiceMessage());
        System.out.println("\n");
        randomAdForRandomPerson.translateToPreferredLanguage();
        randomAdForRandomPerson.sendAd();

        randomAdForRandomPerson.setPreferredLanguage(new PreferredDE());
        System.out.println("\n");
        randomAdForRandomPerson.translateToPreferredLanguage();
        randomAdForRandomPerson.sendAd();

    }
}
