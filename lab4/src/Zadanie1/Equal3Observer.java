package Zadanie1;

public class Equal3Observer implements Observer, DisplayElement{
    private int number;

    @Override
    public void update(int number) {
        this.number = number;
        display();
    }

    @Override
    public void display() {
        if(number == 3){
            System.out.println(number + " =3");
        }
    }
}
