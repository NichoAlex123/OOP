package PR04_2473013_JAVA.EmployeeOOP;
/**
 * PR Pertemuan 04 
 * Contoh Program : Employee Director
 * 
 * @author 2473013-Nicholas Alexander
 * @version 19 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeDirector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Masukkan jumlah employee: ");
        int jmlEmployee = sc.nextInt();

        for (int i = 0; i < jmlEmployee; i++) {
            System.out.print("Masukkan mode (1: Desktop Developer, 2: Experienced Desktop Developer): ");
            int mode = sc.nextInt();
            
            System.out.print("Masukkan nama: ");
            String nama = sc.next();
            
            System.out.print("Masukkan umur: ");
            int umur = sc.nextInt();
            
            System.out.print("Masukkan tahun masuk: ");
            int tahunMasuk = sc.nextInt();
            
            if (mode == 1) {
                employees.add(new DesktopDeveloper(nama, umur, tahunMasuk));
            } else if (mode == 2) {
                System.out.print("Masukkan proyek yang dihandle: ");
                String proyek = sc.next();
                employees.add(new ExperiencedDesktopDeveloper(nama, umur, tahunMasuk, proyek));
            }
        }

        System.out.println("\nData Employee:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        long totalGaji = employees.stream().mapToLong(Employee::getGajiBulanan).sum();
        System.out.println("Total gaji bulanan semua employee: Rp. " + totalGaji);

        sc.close();
    }
}
