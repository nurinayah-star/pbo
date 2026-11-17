class Shop{
    protected String kategori;
    // protected String harga;

    public Shop(String k){
        this.kategori = k;
        // this.harga = h;
    }

}

class Baju extends Shop {
    protected String nama;
    protected int harga;

    public Baju(String k, String n, int h){
        super(k);
        this.nama = n;
        this.harga = h;
    }
    public void tampilkaninfo(){
        System.out.println("kategori" + kategori);
        System.out.println("nama:" + nama);
        System.out.println("harga:" + harga);
    }
}

class Main {
    public static void main(String[] args){
        Baju b1 = new Baju("baju", "piyama", 10000);

        b1.tampilkaninfo();
    }
}



