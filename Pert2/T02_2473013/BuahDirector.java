package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Buah Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class BuahDirector {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", "Hijau", "Manis", 5);
        System.out.println(apel.toString());

        System.out.println();

        Buah jeruk = new Buah("Jeruk", "Orange", "Manis-Asam", 10);
        System.out.println(jeruk.toString());
    }
}
