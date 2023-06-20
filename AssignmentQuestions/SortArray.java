import java.util.Scanner;
import java.util.Arrays;

class SortArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,c; 
        System.out.println("Enter the length of Array");
        n = sc.nextInt();
        int[] a = new int [n];
        for(int i=0 ; i<=n ; i++){
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();
        }
         Arrays.sort(a);
         System.out.println(Arrays.sort(a[]));
       

        

        
    }
}