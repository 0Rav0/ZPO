package Zadanie2;

public class VoiceMessage implements SendMethod{
    @Override
    public void send(Receiver receiver) {
        System.out.println("Sending as VoiceMessage to "+receiver.getName());
    }
}