package PR02_2473013.PenjualanKomputerOOP;
/**
 * PR Pertemuan 02
 * Contoh Program : PK Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 5 Maret 2025
 */
import java.util.Scanner;
public class PKDirector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Jenis Barang yang ada di toko FIT :");
            System.out.println("1. Desktop\n2. Laptop\n3. Notebook\n4. Ultrabook\n5. Tablet\n6. Server");

            System.out.println();
            System.out.println("Barang yang ingin dibeli : ");
            String jenis = input.nextLine();

            System.out.println("Merk yang diinginkan : ");
            String merk = input.nextLine();

            System.out.println("Harga satuan barang : ");
            int harga = input.nextInt();

            System.out.println("Jumlah yang ingin dibeli : ");
            int jumlah = input.nextInt();

            input.nextLine(); 

            PenjualanKomputer pc = new PenjualanKomputer(merk, jenis, harga, jumlah);

            System.out.println("Apakah barang ini jadi dibeli? (Y/N)");
            String confirm = input.nextLine();

            System.out.println();
            if (confirm.equalsIgnoreCase("Y")) {
                System.out.println("Barang yang dibeli:");
                System.out.println(pc);

                System.out.println("Total Belanjaan : " + pc.getTotal());
                System.out.println("Terbilang : " + Terbilang.generate(pc.getTotal()));
                break;
            } else {
                System.out.println("\nMengulang proses pemesanan...\n");
            }
        }

        input.close();
    }
}

