package array;
import java.util.Scanner;
class Array1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n ;
    System.out.println("Enter the Strength of Array");
    n = sc.nextInt();
    int [] a = new int[n];
    for(int i = 0 ; i<n ; i++)
    {
        System.out.println("enter the value of array" +i);
        a[i] = sc.nextInt();
    }
    for (int i = 0 ; i<n ; i++)
    
        System.out.println("values stored at i is "+a[i]);
    
    }
}