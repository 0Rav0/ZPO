package Zadanie;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        CollectItems q1 = new CollectItems(inventory, "coin", 5);
        CollectItems q2 = new CollectItems(inventory, "apple", 10);
        NoCollectItems q3 = new NoCollectItems(inventory, "tomato", 3);

        // Wszystkie itemki po 0
        inventory.addItem("coin",2);
        inventory.addItem("apple",3);
        inventory.addItem("key",1);
        inventory.addItem("coin",6);
        inventory.addItem("tomato",2);
        inventory.removeItem("coin",5);
        inventory.addItem("coin",3);
        inventory.addItem("key",5);
        inventory.addItem("tomato",2);
        inventory.removeItem("key",2);
        inventory.addItem("apple",7);
        inventory.addItem("coin",3);
        inventory.addItem("tomato",2);
    }
}