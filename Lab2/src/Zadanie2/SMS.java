package Zadanie2;

public class SMS implements SendMethod{
    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
