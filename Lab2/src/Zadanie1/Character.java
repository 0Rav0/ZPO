package Zadanie1;

public class Character {
    CharacterClass characterClass;
    Weapon weapon;

    public Character(CharacterClass characterClass, Weapon weapon) {
        this.characterClass = characterClass;
        this.weapon = weapon;
    }

    public void showCharacterClass(){
        characterClass.characterClass();
    }

    public void showEquippedWeapon(){
        weapon.equippedWeapon();
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
