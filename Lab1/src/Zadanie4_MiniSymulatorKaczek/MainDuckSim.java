package Zadanie4_MiniSymulatorKaczek;

import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<>();

        kaczki.add(new MallardDuck(new FlyWithWings(), new Quack()));
        kaczki.add(new RubberDuck(new FlyNoWay(), new Squeak()));
        kaczki.add(new ModelDuck(new FlyNoWay(), new MuteQuack()));

        for (Duck a:kaczki) {
            a.performFly();
            a.performQuack();
        }

        kaczki.get(1).setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("z4Kaczki.Duck if flying on rocket");
            }
        });

        kaczki.get(1).performFly();
    }
}
