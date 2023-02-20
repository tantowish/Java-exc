import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input Number : ");
        int fact=inp.nextInt(),total=1;
        for (int i = fact;i>0;i--){
            total*=i;
        }
        System.out.println("Factorial of "+fact+" is "+ total);
    }
}
