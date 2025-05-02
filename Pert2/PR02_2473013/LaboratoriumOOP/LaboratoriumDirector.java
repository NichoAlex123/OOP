package PR02_2473013.LaboratoriumOOP;
/**
 * PR Pertemuan 02
 * Contoh Program : Laboratorium Director
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 5 Maret 2025
 */
public class LaboratoriumDirector {
    public static void main(String[] args) {
        Laboratorium lab1 = new Laboratorium("PR02 2", 32, 1, 30, 5);
        System.out.println(lab1);

        System.out.println();
        lab1.asistenKeluar(3);
        System.out.println(lab1);

        System.out.println();
        lab1.mhsKeluar(15);
        System.out.println(lab1);
        
        System.out.println();
        lab1.tutupLab();

        System.out.println();
        lab1.asistenKeluar(2);
        lab1.mhsKeluar(15);
        lab1.tutupLab();

        System.out.println();
        System.out.println(lab1);
    }
}
