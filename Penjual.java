class Penjual {
    protected String nama;
    protected String jenis;

    public Penjual (String nm, String jns){
        this.nama = nm;
        this.jenis = jns;
    }
    public void tambilkanInfo(){
        System.out.println("nama pembeli :" + nama);
        System.out.println("jenis makanan" + jenis);
    }

    public static void main(String[] args){
    Kerupuk pmbl1 = new Kerupuk("arham", "cip cip", "manis");

    pmbl1.tampilkaninfo();
    }
}

class Kerupuk extends Penjual {
    public String rasa;

    public Kerupuk (String nm,String jns,String rs){
        super(nm,jns);
        this.rasa = rs;
    }
    public void tampilkaninfo(){
        System.out.println(" Nama pembeli :" + nama);
        System.out.println(" jenis makanan :" + jenis);
        System.out.println("Rasa :" + rasa);
    }
}