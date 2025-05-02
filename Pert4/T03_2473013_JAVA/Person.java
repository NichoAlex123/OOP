package T03_2473013_JAVA;
/**
 * Tugas Pertemuan 04 
 * Contoh Program : Person
 * 
 * @author 2473013-Nicholas Alexander
 * @version 14 Maret 2025
 */
abstract class Person {
    private String nama;
    private String email;
    private String no_telp;

    public Person(String nama, String email, String no_telp){
        this.nama = nama;
        this.email = email;
        this.no_telp = no_telp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setNoTelp(String no_telp) {
        this.no_telp = no_telp;
    }
    public String getNoTelp() {
        return no_telp;
    }
    
    public abstract String DisplayRole();
}
