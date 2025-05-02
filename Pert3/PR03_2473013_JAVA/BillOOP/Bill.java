package PR03_2473013_JAVA.BillOOP;
/**
 * PR Pertemuan 03
 * Contoh Program : Bill 
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 13 Maret 2025
 */
import java.text.DecimalFormat;

public class Bill {
    private String menu;
    private int jumlah;
    private int harga;

    public Bill(String menu, int jumlah, int harga) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        return jumlah * harga;
    }

    public void displayBill() {
        DecimalFormat format = new DecimalFormat("#,###");
        System.out.println("Menu   : " + menu);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga  : " + format.format(harga));
        System.out.println("--------------------------------------------------");
        System.out.println("Total  : Rp " + format.format(getTotal()));
    }
}


