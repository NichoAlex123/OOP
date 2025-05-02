package T03_2473013_JAVA;
/**
 * Tugas Pertemuan 04 
 * Contoh Program : Member
 * 
 * @author 2473013-Nicholas Alexander
 * @version 14 Maret 2025
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Member extends Person {
    private int member_id;
    private String register_date;
    private String expiration_date; 

    public Member(String nama, String email, String no_telp, int member_id, String register_date, String expiration_date) {
        super(nama, email, no_telp);
        this.member_id = member_id;
        this.register_date = register_date;
        this.expiration_date = HitungExpirationDate(register_date);
    }

    @Override
    public String DisplayRole() {
        return "Hi, I'm " + getNama() + ". A member, with ID: " + member_id + " registered on " + register_date + ". My member card will expire on: " + expiration_date;
    }
    
    public void pinjam(String isbn, String tanggal_pinjam) {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Member ID\t: " + member_id);
        System.out.println("Buku\t\t: " + isbn);
        System.out.println("Tanggal Pinjam\t: " + tanggal_pinjam);
    }

    public String HitungExpirationDate(String register_date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tanggal = LocalDate.parse(register_date, format);
        LocalDate expiration = tanggal.plusYears(3);
        return expiration.format(format);
    }
}
