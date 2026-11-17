class Kendaraan {
    private String plat;
    private String merk;
    private int tarifHarian;

    Kendaraan(String p, String m, int t){
        this.plat = p;
        this.merk = m;
        this.tarifHarian = t;
    }

    public String getMerk(){
        return merk;
    }

    public void setTarifHarian(int tarif){
        
        if (tarif <= 0){
            System.out.println("tidak boleh negatif");
        }else {
            this.tarifHarian = tarif;
        }
    }

    public int hitungSewa(int hari){
        return this.tarifHarian *= hari + 50000;
    }

    public void tampilkanInfo(){
        System.out.println("Plat      = " + plat);
        System.out.println("Merk      = " + merk);
        System.out.println("tarif = " + tarifHarian);
    }

    public static void main(String[] args) {
        Kendaraan k1 = new Kendaraan("Avanza", "arkabb", 100000);
        k1.hitungSewa(8);
        k1.tampilkanInfo();
    }
}

class Mobil extends Kendaraan{
    private int kapasitas;

    Mobil(String p, String m, int t, int k){
        super(p,m,t);
        this.kapasitas = k;
    }

    // @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas = " + kapasitas);
    }
}

