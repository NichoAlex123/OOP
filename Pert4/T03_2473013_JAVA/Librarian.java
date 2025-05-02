package T03_2473013_JAVA;
/**
 * Tugas Pertemuan 04 
 * Contoh Program : Librarian
 * 
 * @author 2473013-Nicholas Alexander
 * @version 14 Maret 2025
 */
class Librarian extends Person{
    private int employee_id;
    private String section;

    public Librarian(String nama, String email, String no_telp, int employee_id, String section){
        super(nama, email, no_telp);
        this.employee_id = employee_id;
        this.section = section;
    }

    @Override
    public String DisplayRole() {
        return "Hi, I'm " + getNama() + " - " + employee_id + ". A Librarian, responsible for the " + section + " section.";
    }
}
