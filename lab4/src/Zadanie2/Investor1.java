package Zadanie2;

import java.util.ArrayList;

public class Investor1 implements Observer, DisplayElement{
    private String name;
    private ArrayList<Company> companies;

    public Investor1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(ArrayList<Company> companies) {
        this.companies = companies;
        display();
    }

    @Override
    public void display() {
        System.out.println("=== "+name+" < 6500 ===");
        for (Company company: companies){
            if(company.getValue() < 6500 ){
                System.out.println(company.getName() + " ma wartość "+company.getValue());
            }
        }
        System.out.println();
    }
}
