package Zadanie1;

public class GreaterThan0Observer implements Observer, DisplayElement{
    private int number;
    private Subject numberReader;

    public GreaterThan0Observer(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.registerObserver(this);
    }

    @Override
    public void update(int number) {
        this.number = number;
        if(number > 0)
            display();
    }

    @Override
    public void display() {
        System.out.println(number + " większy niż 0");
    }
}
