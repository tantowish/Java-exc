public class Produk {
    String nama , merk;
    int harga , berat;

    public Produk(){
        nama = "";
        merk = "";
        harga = 0;
        berat = 0;
    }

    public Produk(String nama, String merk , int harga , int berat){
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
        this.berat = berat;
    }
    @Override
    public String toString(){
        return "Nama produk  : "+nama+"\n"+
        "Merk Produk  : "+merk+"\n"+
        "Harga Produk : "+harga+"\n"+
        "Berat Produk : "+berat;
    }
}
