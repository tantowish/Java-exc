public class satu {
    public static void main(String[] args) {
     Lingkaran L1 = new Lingkaran(4);   
     Lingkaran L2 = new Lingkaran(7.5);   
     Lingkaran L3 = new Lingkaran(10);   
     Lingkaran L4 = new Lingkaran(5);  
     Persegi P1 = new Persegi(30 , 35);
     double luasLingkaran = ((L1.getLuas()) + (L2.getLuas()) + L3.getLuas() + L4.getLuas());
     double luasPersegi =  P1.getLuas();
     double luasArsir = (luasPersegi - luasLingkaran);
     System.out.println("Luas arsir adalah " + luasArsir); 
    }
    
}

