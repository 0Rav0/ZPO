package Zadanie3;

public class MainPizzeria {
    public static void main(String[] args) {
        Pizza margheritta = new Cheese(new Sauce(new Margheritta()));
        Pizza capriciosa = new Cheese(new Ham(new Sauce(new Capriciosa())));
        Pizza divola = new Jalapeno(new Sauce(new Diavola()));

        System.out.println(margheritta.getDescription()+ " $"+ margheritta.cost());
        System.out.println(capriciosa.getDescription()+ " $"+ capriciosa.cost());
        System.out.println(divola.getDescription()+ " $"+ divola.cost());

        System.out.println();

        Pizza order1 = new Ham(margheritta);
        System.out.println(order1.getDescription()+ " $"+ order1.cost());

        Pizza order2 = new Cheese(new Ham(new Capriciosa()));
        System.out.println(order2.getDescription()+ " $"+ order2.cost());
    }
}