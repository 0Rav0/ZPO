package Zadanie1;

public class GreaterThan0Observer implements Observer, DisplayElement{
    private int number;

    @Override
    public void update(int number) {
        this.number = number;
        display();
    }

    @Override
    public void display() {
        if(number > 0){
            System.out.println(number + " większy niż 0");
        }
    }
}
