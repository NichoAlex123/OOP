package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Waktu Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class WaktuDirector {
    public static void main(String[] args) {
        Waktu waktu1 = new Waktu(5, 55, 55);
        waktu1.tampilkan_jam();
        System.out.println(waktu1.waktu_to_detik() + " detik");

        System.out.println();
        
        Waktu waktu2 = new Waktu();
        waktu2.detik_to_waktu(4000);
        waktu2.tampilkan_jam();
    }
}
