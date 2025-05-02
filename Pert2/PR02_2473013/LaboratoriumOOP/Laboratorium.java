package PR02_2473013.LaboratoriumOOP;
/**
 * PR Pertemuan 02
 * Contoh Program : Laboratotium
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 5 Maret 2025
 */
public class Laboratorium {
    private String nama_lab;
    private int jml_pc;
    private int jml_printer;
    private int jml_mhs;
    private int jml_asisten;

    public Laboratorium(String nama_lab, int jml_pc, int jml_printer, int jml_mhs, int jml_asisten) {
        this.nama_lab = nama_lab;
        this.jml_pc = jml_pc;
        this.jml_printer = jml_printer;
        this.jml_mhs = jml_mhs;
        this.jml_asisten = jml_asisten;
    }

    public String getNama_lab() {
        return nama_lab;
    }

    public void setNama_lab(String nama_lab) {
        this.nama_lab = nama_lab;
    }

    public int getJml_pc() {
        return jml_pc;
    }

    public void setJml_pc(int jml_pc) {
        this.jml_pc = jml_pc;
    }

    public int getJml_printer() {
        return jml_printer;
    }

    public void setJml_printer(int jml_printer) {
        this.jml_printer = jml_printer;
    }

    public int getJml_mhs() {
        return jml_mhs;
    }

    public int getJml_asisten() {
        return jml_asisten;
    }

    public void mhsMasuk(int jml_mhs) {
        this.jml_mhs += jml_mhs;
    }

    public void mhsKeluar(int jml_mhs) {
        this.jml_mhs -= jml_mhs;
    }

    public void asistenMasuk(int jml_asisten) {
        this.jml_asisten += jml_asisten;
    }

    public void asistenKeluar(int jml_asisten) {
        this.jml_asisten -= jml_asisten;
    }

    public void tutupLab() {
        if (jml_mhs == 0 && jml_asisten == 0) {
            System.out.println("Laboratorium " + nama_lab + " telah ditutup");
        } else {
            System.out.println("Laboratorium " + nama_lab + " tidak boleh ditutup");
        }
    }

    @Override
    public String toString() {
        return "Laboratorium: " + nama_lab + "\n" +
                "PC: " + jml_pc + "\n" +
                "Printer: " + jml_printer + "\n" +
                "Mahasiswa: " + jml_mhs + "\n" +
                "Asisten: " + jml_asisten;
    }
}
