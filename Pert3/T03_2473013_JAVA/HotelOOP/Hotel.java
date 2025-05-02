package T03_2473013_JAVA.HotelOOP;
/**
 * Tugas Pertemuan 03
 * Contoh Program : Hotel
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 7 Maret 2025
 */
public class Hotel {
    private String pemesan;
    private int jml_kamar;
    private int lama_inap;
    private String jenis_kamar;
    private int harga;
    private int total_biaya;

    public Hotel(String pemesan, int jml_kamar, int lama_inap, String jenis_kamar){
        this.pemesan = pemesan;
        this.jml_kamar = jml_kamar;
        this.lama_inap = lama_inap;
        this.jenis_kamar = jenis_kamar;
        this.harga = daftar_harga(jenis_kamar);
        hitung_biaya();  
    }

    public String getPemesan() {
        return pemesan;
    }

    public int getJmlKamar() {
        return jml_kamar;
    }

    public int getLamaInap() {
        return lama_inap;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotalBiaya() {
        return total_biaya;
    }

    public String getJenisKamar() {
        return jenis_kamar;
    }

    private int daftar_harga(String jenis_kamar){
        switch (jenis_kamar.toLowerCase()) {
            case "single bed" : return 500000;
            case "twin bed": return 1200000;
            case "suite": return 3800000;
            case "deluxe": return 5000000;
            default: return 0;
        }
    }

    public void tampilkan_info(){
        System.out.println("Pemesan " + pemesan);
        System.out.println("Jumlah Kamar : " + jml_kamar);
        System.out.println("Lama Inap : " + lama_inap);
        System.out.println("Jenis Kamar : " + jenis_kamar);
        System.out.println("Harga : " + harga);
        System.out.println("Total Biaya: Rp " + total_biaya);
    }

    public void hitung_biaya(){
        this.harga = daftar_harga(jenis_kamar);
        total_biaya = jml_kamar * lama_inap * harga;
    }
    
}
