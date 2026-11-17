package tugas;
interface AsuransiKoleksi {
    double hitungBiayaAsuransi();
}
class Artefak implements AsuransiKoleksi {
    private String kodeInventaris;
    private String nama;
    private int estimasiUsia; 

    public Artefak(String kodeInventaris, String nama, int estimasiUsia) {
        this.kodeInventaris = kodeInventaris;
        this.nama = nama;
        this.estimasiUsia = estimasiUsia;
    }

    public String getKodeInventaris() {
        return kodeInventaris;
    }

    public void setKodeInventaris(String kodeInventaris) {
        this.kodeInventaris = kodeInventaris;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getEstimasiUsia() {
        return estimasiUsia;
    }

    public void setEstimasiUsia(int estimasiUsia) {
        if (estimasiUsia > 0) {
            this.estimasiUsia = estimasiUsia;
        }
    }

    public void tampilkanInfoDasar() {
        System.out.println("Kode Inventaris : " + kodeInventaris);
        System.out.println("Nama Koleksi    : " + nama);
        System.out.println("Estimasi Usia   : " + estimasiUsia + " tahun");
    }

    public double hitungBiayaAsuransi() {
        return estimasiUsia * 150000;
    }
    public double hitungBiayaAsuransi(double faktorRisiko) {
        return (estimasiUsia * 150000) * faktorRisiko;
    }

    public double hitungBiayaAsuransi(double faktorRisiko, double biayaKeamananEkstra) {
        return ((estimasiUsia * 150000) * faktorRisiko) + biayaKeamananEkstra;
    }
}

class LukisanKuno extends Artefak {
    private String mediaLukis;
    private double kelembapanIdeal;

    public LukisanKuno(String kode, String nama, int usia, String mediaLukis, double kelembapanIdeal) {
        super(kode, nama, usia);
        this.mediaLukis = mediaLukis;
        this.kelembapanIdeal = kelembapanIdeal;
    }
    
    public void infoLukisan() {
        tampilkanInfoDasar();
        System.out.println("Media Lukis     : " + mediaLukis);
        System.out.println("Kelembapan Ideal: " + kelembapanIdeal + "%");
    }

    public void aturPencahayaan(int intensitasLux) {
        System.out.println(" -> Pencahayaan diatur ke standar: " + intensitasLux + " Lux.");
    }

    public void aturPencahayaan(int intensitasLux, String jenisFilterUV) {
        System.out.println(" -> Pencahayaan diatur ke: " + intensitasLux + " Lux dengan pelindung " + jenisFilterUV + ".");
    }
}
class KerisPusaka extends Artefak {
    private String jenisPamor;
    private int jumlahLuk;

    public KerisPusaka(String kode, String nama, int usia, String jenisPamor, int jumlahLuk) {
        super(kode, nama, usia);
        this.jenisPamor = jenisPamor;
        this.jumlahLuk = jumlahLuk;
    }
    public void infoKeris() {
        tampilkanInfoDasar();
        System.out.println("Jenis Pamor     : " + jenisPamor);
        System.out.println("Jumlah Luk      : " + jumlahLuk);
    }

    public void prosesJamasan(String jenisMinyak) {
        System.out.println(" -> Keris diolesi dengan " + jenisMinyak + ".");
    }

    public void prosesJamasan(String jenisMinyak, int durasiMenit) {
        System.out.println(" -> Keris direndam dan diolesi " + jenisMinyak + " selama " + durasiMenit + " menit.");
    }
}