package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Tabungan Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class TabunganDirector {
    public static void main(String[] args) {
        Tabungan tabA = new Tabungan();
        tabA.setNama_bank("ABC");
        tabA.setNo_rek("123 1234 1235");
        tabA.menabung(15000);
        System.out.println(tabA);

        System.out.println( );
        tabA.mengambil(10000);
        System.out.println(tabA);
        
        System.out.println();
        Tabungan tabB = new Tabungan();
        tabB.setNama_bank("BCD");
        tabB.setNo_rek("321 1234 1235");
        tabB.menabung(5000);
        System.out.println(tabB);

        System.out.println();
        tabA.tutupRekening();
        System.out.println(tabA);
    }
}
