public class Persegi {

    double panjang;
    double lebar;
    Persegi(){
        panjang = 0;
        lebar = 0;
    }

    Persegi (double panjang , double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public  double getLuas(){
        return (panjang * lebar);
    }

    public double getKeliling(){
        return (2 * (panjang + lebar));
    }

}
