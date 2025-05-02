package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Game Character Director
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
public class GameCharacterDirector {
    public static void main(String[] args) {
        Warrior arthur = new Warrior("Arthur", 70, 2500, 15, "Engraved Spellblade");
        Mage nethamis = new Mage("Nethamis", 68, 1500, 22, "Imperum Caniate");

        Item potion = new Item("Health Potion", "Consumable");
        Item shield = new Item("Iron Shield", "Armor");
        Item spellbook = new Item("Ancient Spellbook", "Magic");
        Item staff = new Item("Mystic Staff", "Weapon");
        Item vial = new Item("Vial of Virtues", "Consumable");

        arthur.inventory.addItem(potion);
        arthur.inventory.addItem(shield);
        nethamis.inventory.addItem(spellbook);
        nethamis.inventory.addItem(staff);

        System.out.println("\n" + arthur);
        arthur.inventory.showInventory();

        System.out.println("\n" + nethamis);
        nethamis.inventory.showInventory();

        System.out.println();
        arthur.attack();
        nethamis.attack();

        nethamis.inventory.addItem(vial);
        nethamis.inventory.showInventory();

        nethamis.inventory.removeItem(spellbook);
        nethamis.inventory.showInventory();

        nethamis.inventory.addItem(vial);
        nethamis.inventory.showInventory();
    }
}
