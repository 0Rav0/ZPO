package Zadanie2;

public class Email implements SendMethod{
    @Override
    public void send() {
        System.out.println("Sending an email");
    }
}
