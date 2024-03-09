package Zadanie2;

import java.util.Random;

public class MainAdvertisement {
    public static void main(String[] args) {
        Random rnd = new Random();
        Advertisement randomAdForRandomPerson = new Advertisement(rnd.nextInt(999), rnd.nextInt(100), new PreferredGB(), new SMS());

        System.out.println("randomAdForRandomPerson");
        System.out.println("PersonId "+randomAdForRandomPerson.getPersonId());
        System.out.println("AdId "+randomAdForRandomPerson.getAdId());
        randomAdForRandomPerson.showPreferredLanguage();
        randomAdForRandomPerson.sendAd();

        randomAdForRandomPerson.setPreferredLanguage(new PreferredPL());
        System.out.println("\nChange language");
        randomAdForRandomPerson.showPreferredLanguage();
        randomAdForRandomPerson.sendAd();

        randomAdForRandomPerson.setSendMethod(new VoiceMessage());
        System.out.println("\nChange send method");
        randomAdForRandomPerson.showPreferredLanguage();
        randomAdForRandomPerson.sendAd();

    }
}
