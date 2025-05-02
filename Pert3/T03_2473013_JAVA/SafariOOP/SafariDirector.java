package T03_2473013_JAVA.SafariOOP;
import java.util.ArrayList;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Safari Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
import java.util.Scanner;
public class SafariDirector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Safari> daftar_safari = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Hewan ke-" + (i + 1));
            System.out.print("Nama Hewan : ");
            String nama_hewan = sc.nextLine();
            System.out.print("Jumlah Pengunjung : ");
            int jml_pengunjung = sc.nextInt();
            System.out.print("Jumlah ZooKeeper : ");
            int jml_zookeeper = sc.nextInt();
            System.out.print("Jumlah Makanan : ");
            int jml_makanan = sc.nextInt();
            System.out.println();
            sc.nextLine();

            daftar_safari.add(new Safari(nama_hewan, jml_pengunjung, jml_zookeeper, jml_makanan));
        }

        System.out.println("Data Safari : ");
        for(Safari s : daftar_safari){
            System.out.println(s);
            System.out.println();
        }

        for( Safari s : daftar_safari){
            s.pengunjungMasuk(s.getJmlPengunjung());
            s.zookeeperMasuk(s.getJmlZooKeeper());
        }

        for( Safari s : daftar_safari){
            s.pengunjungKeluar(s.getJmlPengunjung());
            s.zookeeperKeluar(s.getJmlZooKeeper());
        }

        for( Safari s : daftar_safari){
            s.tutup();
        }
        sc.close();
        
    }
}
