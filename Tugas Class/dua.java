public class dua {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(4);   
        Lingkaran L2 = new Lingkaran(7.5);   
        Lingkaran L3 = new Lingkaran(10);   
        Lingkaran L4 = new Lingkaran(5);  
        Persegi P1 = new Persegi(30 , 35);
        double kelLingkaran = (L1.getKeliling() + L2.getKeliling() + L3.getKeliling() + L4.getKeliling());
        double kelPersegi = P1.getKeliling();
        double total = kelLingkaran + kelPersegi;
        System.out.println("Panjang pagar adalah " + total);
    }
}
