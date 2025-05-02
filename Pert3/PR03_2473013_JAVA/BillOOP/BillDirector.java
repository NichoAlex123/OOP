package PR03_2473013_JAVA.BillOOP;
import java.text.DecimalFormat;
/**
 * PR Pertemuan 03
 * Contoh Program : Bill Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 13 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;
public class BillDirector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatRupiah = new DecimalFormat("Rp #,###");

        String[] list_menu = {"Ayam Goreng", "Ayam Bakar", "Nasi Uduk", "Nasi Putih", "Tahu Goreng"};
        int[] list_harga = {18000, 20000, 15000, 10000, 8000};

        ArrayList<Bill> daftarTransaksi = new ArrayList<>();

        while (true) {
            System.out.println("Menu yang ada :");
            for (int i = 0; i < list_menu.length; i++) {
                System.out.println((i + 1) + ". " + list_menu[i]);
            }

            System.out.println();
            System.out.println("Menu yang ingin dibeli : ");
            String menu_pilihan = sc.nextLine();

            int indexMenu = -1;
            for (int i = 0; i < list_menu.length; i++) {
                if (list_menu[i].equalsIgnoreCase(menu_pilihan)) {
                    indexMenu = i;
                    break;
                }
            }
            if (indexMenu == -1) {
                System.out.print("Menu tidak tersedia. Silakan coba lagi.");
                continue;
            }
            

            System.out.println();
            System.out.println("Jumlah yang ingin dibeli : ");
            int jumlah = sc.nextInt();
            sc.nextLine(); 

            System.out.println("\nHarga satuan: " + formatRupiah.format(list_harga[indexMenu]));
            System.out.print("Apakah Yakin? (Y/N): ");
            String konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("Y")) {
                daftarTransaksi.add(new Bill(list_menu[indexMenu], jumlah, list_harga[indexMenu]));
            }
            if (konfirmasi.equalsIgnoreCase("N")) {
                continue;
            }

            System.out.println("\n==========================================");
            System.out.println("               AYAM BERKAH                 ");
            System.out.println("==========================================");

            int total = 0;
            for (Bill b : daftarTransaksi) {
                System.out.println("Menu   : " + b.getMenu());
                System.out.println("Jumlah : " + b.getJumlah());
                System.out.println("Harga  : " + formatRupiah.format(b.getHarga()));
                System.out.println("------------------------------------------");
                total += b.getTotal();
            }
            System.out.println("Total  : " + formatRupiah.format(total));
            System.out.println("==========================================\n");
            break;
        }
        sc.close();
    }
}
