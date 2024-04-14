package Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader();
        GreaterThan0Observer gt0= new GreaterThan0Observer();
        Equal3Observer e3 = new Equal3Observer();
        DivisibleBy2Observer db2 = new DivisibleBy2Observer();

        Scanner console = new Scanner(System.in);

        int number, option;
        while (true){
            number = console.nextInt();
            if(number == 0){
                System.out.println("Jakie wartości mają być wychwytywane przez program?");
                System.out.println("1) Liczba jest większa od zera");
                System.out.println("2) Liczba jest równa 3");
                System.out.println("3) Liczba jest podzielna przez 2");

                while (true){
                    option = console.nextInt();
                    if(option == 1){
                        numberReader.removeObserver(e3);
                        numberReader.removeObserver(db2);
                        numberReader.registerObserver(gt0);
                        break;
                    } else if (option == 2) {
                        numberReader.removeObserver(gt0);
                        numberReader.removeObserver(db2);
                        numberReader.registerObserver(e3);
                        break;
                    } else if (option == 3) {
                        numberReader.removeObserver(e3);
                        numberReader.removeObserver(gt0);
                        numberReader.registerObserver(db2);
                        break;
                    }
                }
            }
            numberReader.setNumber(number);
        }
    }
}