package PR04_2473013_JAVA.EmployeeOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Desktop Developer
 * 
 * @author 2473013-Nicholas Alexander
 * @version 19 Maret 2025
 */
class DesktopDeveloper extends Employee {
    public DesktopDeveloper(String nama, int umur, int tahunMasuk) {
        super(nama, umur, tahunMasuk);
        this.gajiPokok = 3000000;
    }

    public void tulisKodeProgramJava() {
        System.out.println("Desktop developer sedang menulis kode program Java");
    }

    @Override
    public long getTunjangan() {
        return (tahunMasuk < 2016) ? (100000 * (2024 - tahunMasuk)) : 0;
    }
}
