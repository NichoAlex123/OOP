package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Archer
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
class Archer extends Character {
    private int agility;
    private String bow;

    public Archer(String name, int level, int health, int agility, String bow) {
        super(name, level, health, 5);
        this.agility = agility;
        this.bow = bow;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " shoots an arrow with " + bow + " using " + agility + " agility");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBow=" + bow;
    }
}
