class Robot {
    void berjalan(int jarak) {
        System.out.println("Robot berjalan sejauh" + jarak + " meter");
    }

     int hitungJarakHambatan() {
        int hambatan = 13;
        return hambatan;
     }

     String bersuara() {
        String suaraRobot = "Krik krik krik";
        return suaraRobot;
     }

     public static void main(String[] args) {
        Robot fido = new Robot();
        fido.berjalan(15);
        System.out.println("Jarak hambatan fido adalah " + fido.hitungJarakHambatan());
        System.out.println("Suara robot " + fido.bersuara()); 
     }
}