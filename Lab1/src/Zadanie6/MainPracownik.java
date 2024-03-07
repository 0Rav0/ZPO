package Zadanie6;

public class MainPracownik {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("mechanik");

        pracownik.setDojezdzac(new Samochod());
        pracownik.setPracowac(new NaprawaSamochodow());
        pracownik.setSpedzanieWolnegoCzasu(new LiteraturaPopularnoNaukowa());

        System.out.println(pracownik.getZawod());
        pracownik.dojezdzaj();
        pracownik.pracuj();
        pracownik.spedzajWolnyCzas();
    }
}
