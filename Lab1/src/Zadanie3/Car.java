package Zadanie3;

public class Car {
    String carName;
    CarSpeed carSpeed;

    public Car(String carName, CarSpeed carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public void carSpeed(){
        this.carSpeed.speed();
    }
}
