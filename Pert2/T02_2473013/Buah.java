package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Buah
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class Buah {

    private String nama;
    private String warna;
    private String rasa;
    private int berat;

    public Buah (String nama, String warna, String rasa, int berat) {
        this.nama = nama;
        this.warna = warna;
        this.rasa = rasa;
        this.berat = berat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return warna;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getBerat() {
        return berat;
    }

    public int hitungHarga() {
        return 10000 * berat;
    }

    @Override
    public String toString() {
        return "Buah : " + nama + "\n" +
               "Warna : " + warna + "\n" +
               "Rasa : " + rasa + "\n" +
               "Berat : " + berat + " kg\n" +
               "Harga : Rp" + hitungHarga();
    }
}
