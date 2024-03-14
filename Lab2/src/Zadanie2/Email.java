package Zadanie2;

public class Email implements SendMethod{
    @Override
    public void send(Receiver receiver) {
        System.out.println("Sending an email to " +receiver.getEmail());
    }
}
