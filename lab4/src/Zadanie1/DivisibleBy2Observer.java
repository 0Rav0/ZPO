package Zadanie1;

public class DivisibleBy2Observer implements Observer, DisplayElement{
    private int number;
    private Subject numberReader;

    public DivisibleBy2Observer(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.registerObserver(this);
    }
    @Override
    public void update(int number) {
        this.number = number;
        if(number % 2 == 0 && number != 0)
            display();
    }

    @Override
    public void display() {
        System.out.println(number + " podzieny przez 2");
    }
}
