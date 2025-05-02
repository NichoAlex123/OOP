package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Tabungan
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class Tabungan {
    private String nama_bank;
    private String no_rek;
    private double total_debet;
    private double total_kredit;
    private double saldo;

    public Tabungan() {
        this.nama_bank = "";
        this.no_rek = "";
        this.total_debet = 0;
        this.total_kredit = 0;
        this.saldo = 0;
    }

    public String getNama_bank() {
        return nama_bank;
    }

    public void setNama_bank(String nama_bank) {
        this.nama_bank = nama_bank;
    }

    public String getNo_rek() {
        return no_rek;
    }

    public void setNo_rek(String no_rek) {
        this.no_rek = no_rek;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotal_debet() {
        return total_debet;
    }

    public double getTotal_kredit() {
        return total_kredit;
    }

    public void menabung(int rpDitabung) {
        this.saldo += rpDitabung;
        this.total_kredit += rpDitabung;
    }

    public void mengambil(int rpDiambil) {
        this.saldo -= rpDiambil;
        this.total_debet += rpDiambil;
    }

    public void tutupRekening() {
        this.nama_bank = "";
        this.no_rek = "";
        this.total_debet = 0;
        this.total_kredit = 0;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "Bank: " + nama_bank + "\n" +
                "No Rek: " + no_rek + "\n" +
                "Saldo: " + saldo + "\n" +
                "Debet: " + total_debet + "\n" +
                "Kredit: " + total_kredit;
    }
}
