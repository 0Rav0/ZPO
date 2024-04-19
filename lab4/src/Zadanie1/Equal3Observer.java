package Zadanie1;

public class Equal3Observer implements Observer, DisplayElement{
    private int number;
    private Subject numberReader;

    public Equal3Observer(Subject numberReader) {
        this.numberReader = numberReader;
        numberReader.registerObserver(this);
    }

    @Override
    public void update(int number) {
        this.number = number;
        if(number == 3)
            display();
    }

    @Override
    public void display() {
        System.out.println(number + " =3");
    }
}
