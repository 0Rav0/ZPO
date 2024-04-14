package Zadanie1;

public class DivisibleBy2Observer implements Observer, DisplayElement{
    private int number;

    @Override
    public void update(int number) {
        this.number = number;
        display();
    }

    @Override
    public void display() {
        if(number % 2 == 0){
            System.out.println(number + " podzieny przez 2");
        }
    }
}
