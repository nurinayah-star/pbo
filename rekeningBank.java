public class rekeningBank {
    private String namaPemilik;
    private String noRekening;
    private double saldo;

    public rekeningBank (String np,String nr, double saldo){
        this.namaPemilik = np;
        this.noRekening = nr;
        this.saldo = saldo;
    }

    public void getinfo(){
        System.out.println("nama:" + namaPemilik);
        System.out.println("no rekening : " + noRekening);
    }

    public void setsaldo(double sald){
        this.saldo += sald;
        System.out.println("saldo :" + saldo);
        if (saldo < 0)
            System.out.println("tidak boleh");
    }

    public static void main(String[] args){
        rekeningBank use1 = new rekeningBank("naya", "4567890", 10);
        use1.getinfo();
        use1.setsaldo(-9);
    }
}
