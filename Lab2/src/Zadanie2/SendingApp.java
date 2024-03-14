package Zadanie2;

public class SendingApp {
    Receiver receiver;
    Ad ad;

    public SendingApp(Receiver receiver, Ad ad) {
        this.receiver = receiver;
        this.ad = ad;
    }

    public String translateToPreferredLanguage(){
        return receiver.preferredLanguage.translate(ad.content);
    }

    public void sendAd(){
        ad.sendMethod.send(receiver);
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public Ad getAd() {
        return ad;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
