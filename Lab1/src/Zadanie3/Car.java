package Zadanie3;

public class Car {
    public int maxSpeed;
    public String carName;

    public Car(int maxSpeed, String carName) {
        this.maxSpeed = maxSpeed;
        this.carName = carName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarName() {
        return carName;
    }
}
