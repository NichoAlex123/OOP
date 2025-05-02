package PR04_2473013_JAVA.EmployeeOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Experienced Desktop Developer
 * 
 * @author 2473013-Nicholas Alexander
 * @version 19 Maret 2025
 */
class ExperiencedDesktopDeveloper extends DesktopDeveloper{
    private String handledProject;

    public ExperiencedDesktopDeveloper(String nama, int umur, int tahunMasuk, String handledProject) {
        super(nama, umur, tahunMasuk);
        this.handledProject = handledProject;
    }

    public String getProyekYangSedangDikerjakan() {
        return handledProject;
    }

    @Override
    public long getTunjangan() {
        return (tahunMasuk < 2016) ? (500000 * (2024 - tahunMasuk)) : 0;
    }

    @Override
    public String toString() {
        return super.toString() + " dan sedang mengerjakan proyek: " + handledProject;
    }
}
