package Zadanie6;

public class Pracownik {
    Pracowac pracowac;
    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    String zawod;

    public Pracownik(String zawod) {
        this.zawod = zawod;
    }

    public void pracuj() {
         this.pracowac.pracuj();
    }

    public void dojezdzaj() {
        this.dojezdzac.dojezdzaj();
    }

    public void spedzajWolnyCzas() {
        this.spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    public String getZawod() {
        return zawod;
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public void setDojezdzac(Dojezdzac dojezdzac) {
        this.dojezdzac = dojezdzac;
    }

    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

}
