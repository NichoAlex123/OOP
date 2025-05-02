package PR04_2473013_JAVA.GameCharacterOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Item
 * 
 * @author 2473013-Nicholas Alexander
 * @version 20 Maret 2025
 */
class Item {
    private String name;
    private String type;

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
