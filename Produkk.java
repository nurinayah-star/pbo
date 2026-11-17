public class Produkk {
    String namaProduk;
    double harga;
    int jumlahStok;

    //Constructor
    public void setProduk(String namaProduk, double harga, int jumlahStok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    //Method menghitung total nilai produk
    public double totalNilaiProduk() {
        return jumlahStok * harga;
    }

    //Method untuk menampilkan data produk
    public void tampilkanData() {
        System.out.println("Nama Produk       : " + namaProduk);
        System.out.println("Harga             : " + harga);
        System.out.println("Jumlah Stok       : " + jumlahStok);
        System.out.println("Total Nilai Produk: " + totalNilaiProduk()); 
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        //Membuat objek Product
        Produkk produk1 = new Produkk();
        produk1.setProduk("Laptop",7500000, 10);
        Produkk produk2 = new Produkk();
        produk2.setProduk("Pulpen", 3000, 500);
        //Menampilkan data
        produk1.tampilkanData();
        produk2.tampilkanData();
    }
}