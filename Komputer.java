public class Komputer{
    String merk;
    String processor;
    int ram;
    int tahun;

    void setKomputer(String merk, String processor, int ram, int tahun){
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
        this.tahun = tahun;
    }

    String getInfoKomputer(){
        return "Komputer" + merk + "(" + processor +"), RAM " + ram + "GB";
    }
    public void nyalakanKomputer(){
        System.out.println("Komputer"+ merk + "sedang menyala.");
    }

    public void upgradeRAM(int tambahRam){
        ram += tambahRam;
        System.out.println("RAM bertambah menjadi" + ram + "GB.");
    }
    public static void main(String[] args){
        Komputer komp1 = new Komputer();

        komp1.merk = "ASUS ROG";
        komp1.processor = "Intel Core i7";

        komp1.ram = 16;

        System.out.println("----OBJEK PERRTAMA---");
        System.out.println(komp1.getInfoKomputer());

        komp1.nyalakanKomputer();
        komp1.upgradeRAM(8);


        System.out.println();
         
        Komputer komp2 = new Komputer();
        komp2.setKomputer("Lenovo","AMD Ryzen 5",8,2025);

        System.out.println("----OBJEK KEDUA---");
        System.out.println(komp2.getInfoKomputer());
        komp2.nyalakanKomputer();

        komp2.nyalakanKomputer();

        System.out.println("Merk komputer 2:"+ komp2.merk);
    }
}
