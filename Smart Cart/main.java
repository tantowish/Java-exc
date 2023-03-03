import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("How many item in shopping cart : ");
        int n = inp.nextInt();
        Product[] cart = new Product[n];
        for(int i = 0;i<cart.length;i++){
            System.out.println("\nProduct "+(i+1));
            System.out.print("Name   : ");
            String gtg = inp.nextLine();
            String name = inp.nextLine();
            System.out.print("Brand  : ");
            String brand = inp.nextLine();
            System.out.print("Price  : ");
            int price = inp.nextInt();
            System.out.print("Weight : ");
            int weight = inp.nextInt();
            cart[i] = new Product(name,brand,price,weight);
        }
        int total=0;
        System.out.println("\nList item in cart :");
        for(int i = 0;i<cart.length;i++){
            System.out.println((i+1)+". "+cart[i].name);
            total=cart[i].price;
        }
        System.out.println("Total price is "+total);
        inp.close();
    }
}
