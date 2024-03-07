package Zadanie3;

public class MainCarSpeed {
    public static void main(String[] args) {
        Car Fiat = new Car("Fiat123", new SlowCar());
        Car Tesla = new Car("Tesla2", new FastCar());

        System.out.print(Fiat.carName + " is ");
        Fiat.carSpeed();
        System.out.print(Tesla.carName + " is ");
        Tesla.carSpeed();
    }
}
