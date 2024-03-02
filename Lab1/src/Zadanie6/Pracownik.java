package Zadanie6;

public class Pracownik {
    Pracowac pracowac;
    Dojezdzac dojezdzac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    String zawod;

    public Pracownik(String zawod) {
        this.zawod = zawod;
    }

    public Pracowac getPracowac() {
        return pracowac;
    }

    public Dojezdzac getDojezdzac() {
        return dojezdzac;
    }

    public SpedzanieWolnegoCzasu getSpedzanieWolnegoCzasu() {
        return spedzanieWolnegoCzasu;
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
