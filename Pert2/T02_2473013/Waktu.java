package T02_2473013;
/**
 * Tugas Pertemuan 02
 * Contoh Program : Waktu
 * 
 * @author [2473013]-Nicholas Alexander
 * @version 4 Maret 2025
 */
public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu (int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    public Waktu(){
        this(0, 0, 0);
    }

    public void setJam(int jam){
        this.jam = jam;
    }
    public int getJam(){
        return jam;
    }

    public void setMenit(int menit){
        this.menit = menit;
    }
    public int getMenit(){
        return menit;
    }

    public void setDetik(int detik){
        this.detik = detik;
    }
    public int getDetik(){
        return detik;
    }

    public void tampilkan_jam(){
        System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
    }

    public int waktu_to_detik(){
        return (jam * 3600) + (menit * 60) + detik;
    }

    public void detik_to_waktu(int total_detik){
        this.jam = total_detik / 3600;
        this.menit = (total_detik % 3600) / 60;
        this.detik = total_detik % 60;
    }
}
