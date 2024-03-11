package Zadanie1;

import java.util.ArrayList;

public class MainRPG {
    public static void main(String[] args) {
        ArrayList<Character> players = new ArrayList<>();
        players.add(new RifleManClass(new Rifle()));
        players.add(new Archer(new Bow()));
        players.add(new Knight(new Sword()));
        players.add(new Gunner(new Cannon()));

        for(Character p: players){
            p.drawSelectWeapon();
        }

        System.out.println("\nArcher changed weapon");
        players.get(1).setEquippedWeapon(new Rifle());
        players.get(1).drawSelectWeapon();
    }
}
