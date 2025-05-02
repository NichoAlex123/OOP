package T03_2473013_JAVA.SafariOOP;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Safari
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
public class Safari {
    private String nama_hewan;
    private int jml_pengunjung;
    private int jml_zookeeper;
    private int jml_makanan;

    public Safari(String nama_hewan, int jml_pengunjung, int jml_zookeeper, int jml_makanan){
        this.nama_hewan = nama_hewan;
        this.jml_pengunjung = jml_pengunjung;
        this.jml_zookeeper = jml_zookeeper;
        this.jml_makanan = jml_makanan;
    }

    public void setNamaHewan(String nama_hewan){
        this.nama_hewan = nama_hewan;
    }
    public String getNamaHewan(){
        return nama_hewan;
    }

    public void setJmlPengunjung(int jml_pengunjung){
        this.jml_pengunjung = jml_pengunjung;
    }
    public int getJmlPengunjung(){
        return jml_pengunjung;
    }

    public void setJmlZooKeeper(int jml_zookeeper){
        this.jml_zookeeper = jml_zookeeper;
    }
    public int getJmlZooKeeper(){
        return jml_zookeeper;
    }

    public void setJmlMakanan(int jml_makanan){
        this.jml_makanan = jml_makanan;
    }
    public int getJmlMakanan(){
        return jml_makanan;
    }

    public void  pengunjungMasuk(int jml_pengunjung){
        this.jml_pengunjung += jml_pengunjung;
    }

    public void pengunjungKeluar(int jml_pengunjung){
        this.jml_pengunjung -= jml_pengunjung;
    }

    public void  zookeeperMasuk(int jml_zookeeper){
        this.jml_zookeeper += jml_zookeeper;
    }

    public void  zookeeperKeluar(int jml_zookeeper){
        this.jml_zookeeper -= jml_zookeeper;
    }

    public void tutup(){
        if(jml_pengunjung == 0 && jml_zookeeper == 0){
            System.out.println("Taman Safari Telah Ditutup");
        }else{
            System.out.println("Taman Safari Tidak Boleh Ditutup");
        }
    }

    @Override
    public String toString(){
        return "Nama Hewan : " + nama_hewan + "\n" +
                "Pengunjung : " + jml_pengunjung + "\n" +
                "ZooKeeper : " + jml_zookeeper + "\n" +
                "Makanan : " + jml_makanan;
    }
}
