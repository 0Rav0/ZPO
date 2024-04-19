package Zadanie1;

import java.util.ArrayList;
import java.util.ListIterator;

public class NumberReader implements Subject{
    private int number;
    private boolean iterating;
    ArrayList<Observer> toRemove;
    ArrayList<Observer> toAdd;
    ArrayList<Observer> observers;

    public NumberReader(){
        toRemove = new ArrayList<>();
        toAdd = new ArrayList<>();
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
        if(observers.isEmpty() || !iterating)
            observers.add(o);
        else
            toAdd.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(iterating)
            toRemove.add(o);
        else
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        iterating = true;

        for (Observer o : observers){
            o.update(number);
        }

        iterating = false;

        if(!toAdd.isEmpty()){
            observers.addAll(toAdd);
            toAdd.clear();
        }

        if(!toRemove.isEmpty()){
            observers.removeAll(toRemove);
            toRemove.clear();
        }
    }
}
