public class Produk {
    String namaProduk;
    String kodeProduk;
    int Harga;

    Produk(String inputnamaProduk, String inputkodeProduk, int inputHarga) {
        namaProduk = inputnamaProduk;
        kodeProduk = inputkodeProduk;
        Harga = inputHarga;
        System.out.println("Konstruktor Dieksekusi");
    }

    public void tampilkanInfo(){
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Kode Produk :" + kodeProduk);
        System.out.println("Harga :" + Harga);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Produk produk1 = new Produk ("Sabun mandi", "PRD001",8000);
        System.out.println("==== Informasi Produk 1 ===");
        produk1.tampilkanInfo();

        Produk produk2 = new Produk ("Shampoo", "PRD002", 200000);
        System.out.println("=== Informasi Produk 2 ===");
        produk2.tampilkanInfo();
    }
}
