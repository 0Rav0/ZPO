package Zadanie2;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        Company c1 = new Company("company1", 1000);
        Company c2 = new Company("company2", 5050);
        Company c3 = new Company("company3", 4200);

        stockExchange.addCompany(c1);
        stockExchange.addCompany(c2);

        Investor1 investor1 = new Investor1("Jan");
        stockExchange.registerObserver(investor1);

        System.out.println("-------------------------------------");
        System.out.println("Nowa spółka dodana");
        stockExchange.addCompany(c3);

        Investor2 investor2 = new Investor2("Adam");
        stockExchange.registerObserver(investor2);

        System.out.println("-------------------------------------");
        System.out.println("aktualizacja spółek i nowy inwestor");
        stockExchange.updateCompanies();

        System.out.println("-------------------------------------");
        System.out.println("usunięcie spółki 1");
        stockExchange.removeCompany(c1);
        stockExchange.removeObserver(investor1);

        System.out.println("-------------------------------------");
        System.out.println("aktualizacja spółek i inwestor1 rezygnuje z obserwacji");
        stockExchange.updateCompanies();

    }
}
