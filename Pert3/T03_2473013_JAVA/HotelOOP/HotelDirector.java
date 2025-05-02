package T03_2473013_JAVA.HotelOOP;
import java.util.ArrayList;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Hotel Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
import java.util.Scanner;
public class HotelDirector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hotel> daftar_hotel = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Data Pengguna ke-" + (i + 1));
            System.out.print("Nama Pemesan : ");
            String pemesan = sc.nextLine();
            System.out.print("Jumlah Kamar : ");
            int jml_kamar = sc.nextInt();
            System.out.print("Lama Inap : ");
            int lama_inap = sc.nextInt();
            System.out.print("Jenis Kamar (Single Bed/Twin Bed/Suite/Deluxe) : ");
            String jenis_kamar = sc.nextLine();
            sc.nextLine();
            System.out.println();

            daftar_hotel.add(new Hotel(pemesan, jml_kamar, lama_inap, jenis_kamar));
        }

        System.out.println();
        System.out.println("Data Pemesan hotel : ");
        for(Hotel h : daftar_hotel){
            h.tampilkan_info();
        }
        sc.close();
    }
}
