//Sebuah toko memiliki seperangkat keranjang futuristik, fitur yang ditawarkan adalah keranjang tersebut bisa memberikan total harga belanjaan yang terdapat pada keranjang tersebut. Keranjang belanja ini secara gampangannya merupakan sebuah array yang berisi tipe data "produk" dan "produk" memililiki atribut nama, merk, harga, dan berat barang. Outputkan list barang apa saja yang berada di array tersebut (namanya saja) dan total harga yang harus dibayar.
import java.util.Scanner;
public class projectCoba {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Produk[] keranjang = {
            new Produk("Baju One Piece", "Uniqlo",199000,250),
            new Produk("Lego Kucing","KKV",19000,35),
            new Produk("Cardigan","Uniqlo",349000,300),
            new Produk("Parfum","Kahf",75000,150)
        };
        System.out.println("Terdapat "+keranjang.length+" item dalam keranjang");
        System.out.println("1. List semua item\n2. List item pilihan\n3. Pembayaran");
        int ans = inp.nextInt();
        switch (ans){
            case 1: 
            for(int i=0;i<keranjang.length;i++){
                System.out.println("Barang ke-"+(i+1));
                System.out.println(keranjang[i].toString()+"\n");
            }
            bayar(keranjang);
            break;
            case 2:
            System.out.println("\nPilih :");
            for(int i=0;i<keranjang.length;i++){
                System.out.println((i+1)+". "+keranjang[i].nama);
            }
            System.out.println("5. Keluar");
            int pil = inp.nextInt();
            if(pil>0 && pil<keranjang.length){
                pilihan(keranjang,pil);
            }
            else{
                bayar(keranjang);
                break;
            }
            case 3:
            bayar(keranjang);
    
        }
    }
    public static void cetak(Produk[] keranjang){
        System.out.println("List barang dalam keranjang : ");
        int total=0;
        for(Produk produk:keranjang){
            System.out.println(produk.nama);
            total = total + produk.harga;
        }
        System.out.println();
        System.out.println("Total harga yang harus dibayar adalah Rp" + total + ",00");
    }
    public static void pilihan(Produk[] keranjang,int pil){
        Scanner inp = new Scanner(System.in);
        System.out.println(keranjang[pil-1]);
        System.out.println("Pilih : ");
        pil = inp.nextInt();
        if(pil>0 && pil<=keranjang.length){
            pilihan(keranjang,pil);
        }
        else{
            bayar(keranjang);
        }

    }
    public static void bayar(Produk[] keranjang){
        Scanner inp = new Scanner(System.in);
        System.out.print("Apakah ingin membayar ? (y/n) ");
        String anss = inp.nextLine();
        if(anss.equalsIgnoreCase("y")){
            cetak(keranjang);
        }
        inp.close();
    }
}
