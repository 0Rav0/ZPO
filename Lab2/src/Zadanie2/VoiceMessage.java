package Zadanie2;

public class VoiceMessage implements SendMethod{
    @Override
    public void send() {
        System.out.println("Sending as VoiceMessage");
    }
}