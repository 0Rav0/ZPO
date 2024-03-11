package Zadanie2;

public class Advertisement {
    int personId;
    int adId;
    PreferredLanguage preferredLanguage;
    SendMethod sendMethod;

    public Advertisement() {
    }

    public Advertisement(int personId, int adId, PreferredLanguage preferredLanguage, SendMethod sendMethod) {
        this.personId = personId;
        this.adId = adId;
        this.preferredLanguage = preferredLanguage;
        this.sendMethod = sendMethod;
    }

    public void translateToPreferredLanguage(){
        preferredLanguage.language();
    }

    public void sendAd(){
        sendMethod.send();
    }

    public int getPersonId() {
        return personId;
    }

    public int getAdId() {
        return adId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public void setPreferredLanguage(PreferredLanguage preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public void setSendMethod(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }
}
