package Zadanie1;

import java.util.Scanner;

public class ZeroObserver implements Observer, DisplayElement{
    private int number;
    private Subject numberReader;
    DivisibleBy2Observer db2;
    Equal3Observer e3;
    GreaterThan0Observer gt0;
    Scanner console = new Scanner(System.in);

    public ZeroObserver(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.registerObserver(this);
    }

    @Override
    public void update(int number) {
        this.number = number;

        if(number == 0) {
            int option;
            while (true) {
                display();
                option = console.nextInt();
                if (option == 1) {
                    numberReader.removeObserver(db2);
                    numberReader.removeObserver(e3);
                    if (gt0 == null)
                        gt0 = new GreaterThan0Observer(numberReader);
                    else
                        numberReader.registerObserver(gt0);
                    break;
                } else if (option == 2) {
                    numberReader.removeObserver(gt0);
                    numberReader.removeObserver(db2);
                    if(e3 == null)
                        e3 = new Equal3Observer(numberReader);
                    else
                        numberReader.registerObserver(e3);
                    break;
                } else if (option == 3) {
                    numberReader.removeObserver(e3);
                    numberReader.removeObserver(gt0);
                    if(db2 == null)
                        db2 = new DivisibleBy2Observer(numberReader);
                    else
                        numberReader.registerObserver(db2);
                    break;
                }
            }
        }
    }

    @Override
    public void display() {
        System.out.println("Jakie wartości mają być wychwytywane przez program?");
        System.out.println("1) Liczba jest większa od zera");
        System.out.println("2) Liczba jest równa 3");
        System.out.println("3) Liczba jest podzielna przez 2");
    }
}
