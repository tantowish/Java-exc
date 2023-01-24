import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Operation : + - * /");
        System.out.print("Pick operation : ");
        String op = inp.nextLine();
        System.out.print("first integer  : ");
        int num1=inp.nextInt();
        System.out.print("second integer : ");
        int num2=inp.nextInt();
        if(op.equals("+")){
            System.out.println(num1+" + "+num2 + " = " + (num1+num2));
        }
        else if(op.equals("-")){
            System.out.println(num1+" - "+num2 + " = " + (num1-num2));
        }
        else if(op.equals("*")){
            System.out.println(num1+" * "+num2 + " = " + (num1*num2));
        }
        else if(op.equals("/")){
            System.out.println(num1+" / "+num2 + " = " + (num1/num2));
        }
        else{
            System.out.println("Wrong input");
        }
        inp.close();
    }
}
