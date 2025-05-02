package PR04_2473013_JAVA.GameCharacterOOP;
import java.util.ArrayList;
/**
 * PR Pertemuan 04 
 * Contoh Program : Inventory
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
import java.util.List;
class Inventory {
    private List<Item> items;
    private int maxCapacity;

    public Inventory(int maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public boolean addItem(Item item) {
        if (items.size() < maxCapacity) {
            items.add(item);
            System.out.println(item.getName() + " added to inventory.");
            return true;
        } else {
            System.out.println("Inventory is full, cannot add " + item.getName());
            return false;
        }
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void showInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory Items:");
            for (Item item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
