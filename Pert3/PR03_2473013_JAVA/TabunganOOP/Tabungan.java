package PR03_2473013_JAVA.TabunganOOP;
/**
 * PR Pertemuan 03
 * Contoh Program : Tabungan
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 13 Maret 2025
 */

import java.util.ArrayList;

public class Tabungan {
    private String nama_bank;
    private String no_rekening;
    private String nama_pemilik;
    private double saldo;
    private ArrayList<TabunganLog> log;

    public Tabungan (String nama_bank, String no_rekening, String nama_pemilik, double saldo) {
        this.nama_bank = nama_bank;
        this.no_rekening = no_rekening;
        this.nama_pemilik = nama_pemilik;
        this.saldo = 0;
        this.log = new ArrayList<>();
    }

    public String getNamaBank() { return nama_bank; }
    public String getNoRekening() { return no_rekening; }
    public String getNamaPemilik() { return nama_pemilik; }
    public double getSaldo() { return saldo; }

    public void menabung(double jumlah_ditabung) {
        saldo += jumlah_ditabung;
        log.add(new TabunganLog(0, jumlah_ditabung, saldo));
    }

    public void mengambil(double jumlah_diambil) {
        if (saldo >= jumlah_diambil) {
            saldo -= jumlah_diambil;
            log.add(new TabunganLog(jumlah_diambil, 0, saldo));
        } else {
            System.out.println("Saldo Anda Tidak Cukup");
        }
    }

    public void transfer(Tabungan tab_lain, double jumlah_transfer) {
        if (saldo >= jumlah_transfer) {
            this.mengambil(jumlah_transfer);
            tab_lain.menabung(jumlah_transfer);
        } else {
            System.out.println("Saldo Anda Tidak Cukup Untuk Transfer.");
        }
    }

    public boolean equals(Tabungan tab_lain) {
        return this.nama_bank.equals(tab_lain.nama_bank) &&
                this.no_rekening.equals(tab_lain.no_rekening) &&
                this.nama_pemilik.equals(tab_lain.nama_pemilik);
    }

    public void tampilkan_log() {
        System.out.println(this);
        for (TabunganLog info_log : log) {
            System.out.println(info_log);
        }
    }

    @Override
    public String toString() {
        return "Tabungan(namaBank=" + nama_bank + ", noRekening=" + no_rekening + ", namaPemilik=" + nama_pemilik    + ", saldo=" + saldo + ")";
    }
}
