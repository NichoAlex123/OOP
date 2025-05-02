package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Mage
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
class Mage extends Character{
    private int mana;
    private String spell;

    public Mage(String name, int level, int health, int mana, String spell) {
        super(name, level, health, 5);
        this.mana = mana;
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + spell + " using " + mana + " Mana");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpell=" + spell;
    }
}
