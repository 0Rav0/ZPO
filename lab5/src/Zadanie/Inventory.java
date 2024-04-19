package Zadanie;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Inventory implements Subject{
    private Dictionary<String, Integer> items;
    ArrayList<Observer> observers;

    public Inventory(){
        observers = new ArrayList<>();
        items = new Hashtable<>();
        items.put("coin", 0);
        items.put("key", 0);
        items.put("apple", 0);
        items.put("tomato", 0);
    }

    public int getItemAmount(String name){
        return items.get(name);
    }

    public void setItemAmount(String name, int amount) {
        this.items.put(name, amount);
        notifyObservers();
    }

    public void addItem(String name, int amount) {
        this.items.put(name, items.get(name)+amount);
        notifyObservers();
    }

    public void removeItem(String name, int amount) {
        this.items.put(name, items.get(name)-amount);
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
        try {
            for (Observer o : observers){
                o.update(this.items);
            }
        } catch (Exception ex) {
            //throw new RuntimeException(ex);
        }

    }
}