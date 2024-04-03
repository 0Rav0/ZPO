package Zadanie3;

public class MainPizzeria {
    public static void main(String[] args) {
        Pizza order1 = new Cheese(new Sauce(new Margheritta()));
        System.out.println(order1.getDescription()+ " $"+ order1.cost());

        Pizza order2 = new Ham(new Cheese(new Sauce(new Capriciosa())));
        System.out.println(order2.getDescription()+ " $"+ order2.cost());
        order2.omittingIngredient(Cheese.class);
        System.out.println(order2.getDescription()+ " $"+ order2.cost());
    }
}