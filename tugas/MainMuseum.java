package tugas;
public class MainMuseum {
    public static void main(String[] args) {
        System.out.println("=== SISTEM KONSERVASI ARTEFAK MUSEUM ===\n");

      
        LukisanKuno lukisan = new LukisanKuno("LKS-01", "Penangkapan Pangeran Diponegoro", 169, "Kanvas Minyak", 50.5);
        KerisPusaka keris = new KerisPusaka("KRS-09", "Keris Kyai Sengkelat", 550, "Beras Wutah", 13);

  
        System.out.println("--- DATA KOLEKSI 1: LUKISAN KUNO ---");
        lukisan.infoLukisan();
        lukisan.aturPencahayaan(50); 
        lukisan.aturPencahayaan(50, "Filter Anti-UV Kaca Akrilik"); 
        System.out.println("Asuransi Standar (Tanpa Parameter) : Rp" + String.format("%,.0f", lukisan.hitungBiayaAsuransi()));
        System.out.println("Asuransi Risiko (1 Parameter)      : Rp" + String.format("%,.0f", lukisan.hitungBiayaAsuransi(1.2)));
        System.out.println();

       
        System.out.println("--- DATA KOLEKSI 2: KERIS PUSAKA ---");
        keris.infoKeris();
        keris.prosesJamasan("Minyak Cendana");
        keris.prosesJamasan("Minyak Cendana Murni", 45);
        
        System.out.println("Asuransi VVIP (2 Parameter)        : Rp" + String.format("%,.0f", keris.hitungBiayaAsuransi(1.5, 5000000)));
        System.out.println();


        System.out.println("--- PEMBARUAN DATA (ENCAPSULATION) ---");
        keris.setEstimasiUsia(560);
        System.out.println("Usia " + keris.getNama() + " diperbarui menjadi: " + keris.getEstimasiUsia() + " tahun.");
    }
}