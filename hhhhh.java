// Superclass (Kelas Induk)
class Hewan {
    String nama;
    String jenis;
    int umur;
    
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
    public void tidur() {
        System.out.println(nama + " sedang tidur: Zzz...");
    }
    public void infoHewan() {
        System.out.println("--- Profil Hewan ---");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Umur  : " + umur + " Tahun");
        System.out.println("--------------------");
    }
}

class Kucing extends Hewan {

    public Kucing(String nama, String jenis, int umur) {
        super(nama, jenis, umur);
    }

    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }
    public void bermain() {
        System.out.println(nama + " sedang bermain bola benang.");
    }
}

public class hhhhh {
    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing("Milo", "Persia", 2);
        
        kucingSaya.infoHewan(); 
    
        kucingSaya.makan();
        kucingSaya.bersuara();
        
        kucingSaya.bermain();
        kucingSaya.tidur();
    }
}