package T03_2473013_JAVA.JarakOOP;
import java.util.ArrayList;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Jarak Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
import java.util.Scanner;
public class JarakDirector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jarak> daftar_jarak = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data kendaraan ke " + (i +1) + " : ");
            System.out.print("Jenis Kendaraan : ");
            String kendaraan = sc.nextLine();
            System.out.print("Waktu (jam) : ");
            int waktu = sc.nextInt();
            System.out.print("Kecepatan (km/jam) : ");
            int kecepatan = sc.nextInt();
            System.out.println();
            sc.nextLine();
            
            daftar_jarak.add(new Jarak(kendaraan, waktu, kecepatan));
        }

        System.out.println();
        System.out.println("Data Jarak Kendaraan : ");
        for ( Jarak j : daftar_jarak){
            System.out.println(j);
            System.out.println();
        }
        sc.close();
    }
}
