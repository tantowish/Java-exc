public class Lingkaran {
    
    double jari ;

    public Lingkaran(){
        jari = 0;

    }

    public Lingkaran(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        return (3.14 * jari * jari);
    }   

    public double getKeliling(){
        return (2 * 3.14 * jari);
    }
}

