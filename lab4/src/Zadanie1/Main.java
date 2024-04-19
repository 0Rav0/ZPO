package Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader();
        ZeroObserver zeroObserver = new ZeroObserver(numberReader);

        Scanner console = new Scanner(System.in);

        int number;
        while (true){
            numberReader.setNumber(console.nextInt());
        }
    }
}