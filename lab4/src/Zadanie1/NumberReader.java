package Zadanie1;

import java.util.ArrayList;

public class NumberReader implements Subject{
    private int number;

    ArrayList<Observer> observers;

    public NumberReader(){
        observers = new ArrayList<>();
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
        numberUpdated();
    }

    private void numberUpdated() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(number);
        }
    }
}
