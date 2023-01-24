import java.util.Scanner;
public class bubbleSort {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        //Input
        System.out.print("Number of elements : ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        //Sorting
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        //Sorted output
        System.out.println("Sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        inp.close();
    }
}
