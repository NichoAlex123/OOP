package PR02_2473013.PenjualanKomputerOOP;
/**
 * PR Pertemuan 02
 * Contoh Program : Penjualan Komputer
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 5 Maret 2025
 */
public class PenjualanKomputer {
    private String merk;
    private String type;
    private int harga;
    private int jumlah;
    private int totalHarga;

    public PenjualanKomputer(){
        this.merk = "";
        this.type = "";
        this.harga = 0;
        this.jumlah = 0;
        this.totalHarga = 0;
    }

    public PenjualanKomputer(String merk, String type, int harga, int jumlah) {
        this.merk = merk;
        this.type = type;
        this.harga = harga;
        this.jumlah = jumlah;
        setTotal(jumlah, harga);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setTotal(int jumlah, int harga) {
        this.totalHarga = jumlah * harga;
    }

    public int getTotal() {
        return totalHarga;
    }

    @Override
    public String toString() {
        return "Barang : " + type + "\n" +
               "Merk : " + merk + "\n" +
               "Harga : " + harga + "\n" +
               "Jumlah : " + jumlah + "\n" +
               "===============================";
    }
}