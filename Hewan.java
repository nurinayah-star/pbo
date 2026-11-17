public class Hewan{
    String nama_Hewan;
    String jenis;
    int umur;

    public Hewan (String nama, String jenis, int umur){
        this.nama_Hewan = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    public void tampilkanInfo(){
        System.out.println("Nama hewan: " + nama_Hewan);
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + umur);
    }
}
class Kucing extends Hewan{
    public String namapanggilan;

    public Kucing(String nama, String jenis, int umur, String namapanggilan){
        super(nama, jenis, umur);
        this.namapanggilan = namapanggilan;
    }
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Nama Panggilan: " + namapanggilan);
    }
}

class Ayam extends Hewan{
    public Ayam(String nama, String jenis, int umur){
        super(nama, jenis, umur);
    }
    public void tampilkanInfo(){
        super.tampilkanInfo();
    }
}
class main{
  public static void main(String[] args){
        Kucing kucing1 = new Kucing("kucing", "Mamalia", 3, "Kiki");
        kucing1.tampilkanInfo();
        System.out.println();
        
        Ayam ayam1 = new Ayam("ayam", "bangkok", 1); 
        ayam1.tampilkanInfo();
    }
}
