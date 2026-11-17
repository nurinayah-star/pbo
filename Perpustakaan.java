import java.util.Scanner;

public class Perpustakaan{
    String namaAnggota;
    String IdAnggota;
    int JumlahBuku;
    int batasMaksimal = 5;

    public Perpustakaan(String inputnamaAnggota, String InputIdAnggota, int inputJumlahBuku){
        this.namaAnggota = inputnamaAnggota;
        this.IdAnggota = InputIdAnggota;
        this.JumlahBuku = inputJumlahBuku;
    }
    public void peminjamanBuku(int jumlahbuku, int batasMaksimal){
        if (jumlahbuku > 0 && jumlahbuku <= batasMaksimal){
            JumlahBuku = jumlahbuku;
            System.out.println("Peminjaman buku berhasil. Jumlah buku yang dipinjam: " + JumlahBuku);
        } else {
            System.out.println("Peminjaman gagal. " + batasMaksimal + " buku adalah batas maksimal peminjaman.");
        }
    }
    public void pengembalianBuku(){
        if (JumlahBuku > 0){
            System.out.println("Pengembalian buku berhasil. Jumlah buku yang dikembalikan: " + JumlahBuku);
            JumlahBuku = 0; 
        } else {
            System.out.println("Tidak ada buku yang dipinjam untuk dikembalikan.");
        }
    }
    public void tampilkanInfo(){
        System.out.println("Informasi Peminjam:");
        System.out.println("Nama Peminjam : " + namaAnggota);
        System.out.println("Id Anggota :" + IdAnggota);
        System.out.println("Jumlah buku yg di pinjam: " + JumlahBuku);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Perpustakaan anggota1 = new Perpustakaan("nayyy", "001", 9);

        System.out.println("Selamat Datang " + anggota1.namaAnggota + " ! Jumlah buku yang Anda pinjam " + anggota1.JumlahBuku);
        System.out.println();

        
        System.out.println("Pilih menu:");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Pengembalian Buku");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

           if (pilihan == 1) {
            System.out.print("Masukkan jumlah buku yang ingin dipinjam: ");
            int pinjam = input.nextInt();
            anggota1.peminjamanBuku(pinjam, anggota1.batasMaksimal);
        } else if (pilihan == 2) {
            System.out.print("Masukkan jumlah buku yang ingin dikembalikan: ");
            int kembali = input.nextInt();
            anggota1.pengembalianBuku();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}                                   