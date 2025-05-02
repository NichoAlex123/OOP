package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Warrior
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
class Warrior extends Character{
    private int strength;
    private String weapon;

    public Warrior(String name, int level, int health, int strength, String weapon) {
        super(name, level, health, 5);
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + weapon + " using " + strength + " strength");
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeapon=" + weapon;
    }
}
