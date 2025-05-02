package T03_2473013_JAVA.JarakOOP;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Jarak
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
public class Jarak {
    private String kendaraan;
    private int waktu;
    private int kecepatan;

    public Jarak(String kendaraan, int waktu, int kecepatan) {
        this.kendaraan = kendaraan;
        this.waktu = waktu;
        this.kecepatan = kecepatan;
    }

    public void setKendaraan(String kendaraaan){
        this.kendaraan = kendaraaan;
    }
    public String getKendaraan(){
        return kendaraan;
    }

    public void setWaktu(int waktu){
        this.waktu = waktu;
    }
    public int getWaktu(){
        return waktu;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public int getkecepatan(){
        return kecepatan;
    }

    public int hitung_jarak(){
        return waktu * kecepatan;
    }

    @Override
    public String toString(){
        return "Kendaraan : " + kendaraan + "\n" +
            "Waktu : " + waktu + "\n" +
            "Kecepatan : " + kecepatan + "\n" +
            "Jarak : " + hitung_jarak() + "km";
    }
}