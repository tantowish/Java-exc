public class tiga {
    public static void main(String[] args) {
        Produk[] keranjang = {
            new Produk("Celana Chino", "Executive",249000,300),
            new Produk("Baju Kaos", "Uniqlo",199000,200),
            new Produk("Sepatu Running","Ortus eight",554000,400),
            new Produk("Kaos Kaki","Ortuseight",19000,50),
            new Produk("Long-Sleeve Waffle Knit","Uniqlo",249000,300),
            new Produk("Hoodie","H&M",249000,350)
        };
        System.out.println("List item dalam keranjang :");
        int total=0;
        for (int i=0;i<keranjang.length;i++){
            System.out.println((i+1)+". "+keranjang[i].nama);
            total+=keranjang[i].harga;        
        }
        System.out.println("\nTotal harga item : Rp"+total  );
    }
}
