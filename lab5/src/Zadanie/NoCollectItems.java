package Zadanie;

import java.util.Dictionary;

public class NoCollectItems implements Observer, DisplayElement{
    private String itemName;
    private int itemAmount;
    private int itemMax;
    private Subject inventory;

    public NoCollectItems(Subject inventory, String itemName, int max) {
        this.inventory = inventory;
        this.itemName = itemName;
        this.itemMax = max;
        inventory.registerObserver(this);
    }

    @Override
    public void update(Dictionary<String, Integer> items) {
        this.itemAmount = items.get(itemName);
        display();
        if(itemAmount >= itemMax)
            this.inventory.removeObserver(this);
    }

    @Override
    public void display() {
        if(itemAmount >= itemMax){
            System.out.println("Zebrałeś aż "+itemMax+" "+itemName+" - Przegrałęś :(");
        }
        else{
            System.out.println("Masz już "+itemAmount+"/"+itemMax+" "+itemName);
        }
    }
}
