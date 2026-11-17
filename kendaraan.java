public class kendaraan {
    String merek;
    double harga;

    public kendaraan(String mr,double hrg){
        this.merek = mr;
        this.harga = hrg;
    }
    public void tampilkanInfo(){
        System.out.println("Merek :"+ merek);
        System.out.println("Harga :"+ harga);
    }
    public double hitungPajak(){
      return harga * 0.2;
    }
}
class sepedaMotor extends kendaraan{
    int kapasitasMesin;
    sepedaMotor(String mr,double hrg,int km){
        super(mr , hrg);
        this.kapasitasMesin = km;
    }
public void sebutMesin(){
    System.out.println("Merek:" + super.merek + "Bertenaga:" + this.kapasitasMesin + "cc");
}
    public void tampilkanInfo(){
        System.out.println("Merek :"+ this.merek);
        System.out.println("Harga :"+ this.harga);
        System.out.println("kapasitas mesin:" + kapasitasMesin);
        System.out.println("Pajak tahunan:" + "Rp."+ hitungPajak());
    }
    public static void main(String[] agrs){
    sepedaMotor s1 = new sepedaMotor("honda beat",7500000,110);
    sepedaMotor s2 = new sepedaMotor("Yamaha NMAX",890000,155);
    s1.tampilkanInfo();
    s1.sebutMesin();
    System.out.println();

    s2.tampilkanInfo();
    s2.sebutMesin();
    System.out.println();

    }
}



