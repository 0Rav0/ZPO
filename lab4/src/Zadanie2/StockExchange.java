package Zadanie2;

import java.util.ArrayList;
import java.util.Random;

public class StockExchange implements Subject{
    private ArrayList<Observer> observers;
    ArrayList<Company> companies;

    Random rnd = new Random();

    public StockExchange(){
        observers = new ArrayList<>();
        companies = new ArrayList<>();
    }

    public void addCompany(Company company){
        companies.add(company);
        notifyObservers();
    }

    public void removeCompany(Company company){
        companies.remove(company);
        notifyObservers();
    }

    public void setCompanies(ArrayList<Company> companies){
        this.companies = companies;
        notifyObservers();
    }

    public void updateCompanies() {
        for (Company company: companies){
            double value = company.getValue();
            value = Math.abs(value * rnd.nextInt(4 + 1) - value / 2);
            company.setValue(value);
        }
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
            o.update(companies);
        }
    }
}
