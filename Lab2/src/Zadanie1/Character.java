package Zadanie1;

public abstract class Character {
    EquippedWeapon equippedWeapon;

    public Character(EquippedWeapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }
    public void drawSelectWeapon(){
        equippedWeapon.drawWeapon();
    }

    public void setEquippedWeapon(EquippedWeapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }
}
