package Zadanie3;

public class Car {
    private int maxSpeed;
    private String carName;

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

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
