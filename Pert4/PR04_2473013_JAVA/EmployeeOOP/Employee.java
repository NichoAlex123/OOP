package PR04_2473013_JAVA.EmployeeOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Employee
 * 
 * @author 2473013-Nicholas Alexander
 * @version 19 Maret 2025
 */
abstract class Employee {
    protected String nama;
    protected int umur;
    protected long gajiPokok = 2000000;
    protected int tahunMasuk;

    public Employee(String nama, int umur, int tahunMasuk) {
        this.nama = nama;
        this.umur = umur;
        this.tahunMasuk = tahunMasuk;
    }  
    
    public long getGajiBulanan() {
        return gajiPokok + getTunjangan();
    }

    public abstract long getTunjangan();

    @Override
    public String toString() {
        return nama + " dengan umur " + umur + " yang mulai bekerja dari tahun " + tahunMasuk + " dan memiliki gaji bulanan Rp. " + getGajiBulanan();
    }
}
