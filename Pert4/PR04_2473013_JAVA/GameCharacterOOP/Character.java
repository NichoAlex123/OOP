package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Character
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
abstract class Character {
    private String name;
    private int level;
    private int health;
    Inventory inventory;

    public Character(String name, int level, int health, int inventorySize) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.inventory = new Inventory(5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public abstract void attack();

    @Override
    public String toString() {
        return "Character\nName=" + name + "\nLevel=" + level + "\nHealth=" + health;
    }
}
