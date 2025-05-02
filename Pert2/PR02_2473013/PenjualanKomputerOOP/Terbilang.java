package PR02_2473013.PenjualanKomputerOOP;
/**
 * PR Pertemuan 02
 * Contoh Program : Terbilang (PK Director)
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 5 Maret 2025
 */
public class Terbilang {
    private static final String[] angka = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public static String generate(int number) {
        if (number < 12) {
            return angka[number];
        } else if (number < 20) {
            return angka[number - 10] + " belas";
        } else if (number < 100) {
            return angka[number / 10] + " puluh " + generate(number % 10);
        } else if (number < 200) {
            return "seratus " + generate(number - 100);
        } else if (number < 1000) {
            return angka[number / 100] + " ratus " + generate(number % 100);
        } else if (number < 2000) {
            return "seribu " + generate(number - 1000);
        } else if (number < 1000000) {
            return generate(number / 1000) + " ribu " + generate(number % 1000);
        } else if (number < 1000000000) {
            return generate(number / 1000000) + " juta " + generate(number % 1000000);
        } else {
            return generate(number / 1000000000) + " miliar " + generate(number % 1000000000);
        }
    }
}
