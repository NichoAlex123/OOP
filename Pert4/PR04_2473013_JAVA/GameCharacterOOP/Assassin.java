package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Assassin
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
class Assassin extends Character{
    private int stealth;
    private String dagger;

    public Assassin(String name, int level, int health, int stealth, String dagger) {
        super(name, level, health, 5);
        this.stealth = stealth;
        this.dagger = dagger;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " strikes from the shadows with " + dagger + " using " + stealth + " stealth");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDagger=" + dagger;
    }
}
