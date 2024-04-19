package Zadanie;

import java.util.Dictionary;

public class CollectItems implements Observer, DisplayElement{
    private String itemName;
    private int itemAmount;
    private int itemNeeded;
    private Subject inventory;

    public CollectItems(Subject inventory, String itemName, int needed) {
        this.inventory = inventory;
        this.itemName = itemName;
        this.itemNeeded = needed;
        inventory.registerObserver(this);
    }

    @Override
    public void update(Dictionary<String, Integer> items) {
        this.itemAmount = items.get(itemName);
        display();
        if(itemAmount >= itemNeeded)
            this.inventory.removeObserver(this);
    }

    @Override
    public void display() {
        if(itemAmount >= itemNeeded){
            System.out.println("Zebrałeś wszystkie "+itemNeeded+" "+itemName);
        }
        else{
            System.out.println("Masz "+itemAmount+"/"+itemNeeded+" "+itemName);
        }
    }
}
