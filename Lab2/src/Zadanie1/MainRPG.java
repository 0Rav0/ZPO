package Zadanie1;

import java.util.ArrayList;

public class MainRPG {
    public static void main(String[] args) {
        ArrayList<Character> players = new ArrayList<>();
        players.add(new Character(new RifleManClass(), new Rifle()));
        players.add(new Character(new ArcherClass(), new Bow()));
        players.add(new Character(new KnightClass(), new Sword()));
        players.add(new Character(new GunnerClass(), new Cannon()));

        for(Character p: players){
            p.showCharacterClass();
            p.showEquippedWeapon();
        }

        System.out.println("\nArcher changed weapon\n");
        players.get(1).setWeapon(new Rifle());
        players.get(1).showCharacterClass();
        players.get(1).showEquippedWeapon();
    }
}
