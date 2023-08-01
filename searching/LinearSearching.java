package searching;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String args[]){
        int n,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0 ; i<n ; i++){
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();  
        }
        System.out.println("enter the number you want to search");
        b = sc.nextInt();
        boolean isFound = false;
        for (int i=0 ; i< a.length; i++){
            if(a[i] == b)
            {
                isFound = true;
                System.out.println("Element is at postion ="+i);
            }
        }
        if(isFound == false){
        System.out.println("Element not found");
        }
    

      
    }
    
}
