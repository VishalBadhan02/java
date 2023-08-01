package searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        n = sc.nextInt();
        int a [] = new int[n];
        for (int i =0 ; i <n; i++){
            System.out.println("Enter the elements"); 
            a[i] = sc.nextInt();           
        }        
        for (int j =0 ; j<a.length ; j++){
               for (int k =0 ; k < a.length ; k++){
                if(a[j]<a[k]){
                    int temp = a[j];
                    a[j]= a[k];
                    a[k] = temp;
                }
               }
              
            } 
        System.out.println("Enter the number you want to search");
        int s = sc.nextInt();
        int l = 0 ;
        int h = n;
        int middleElement;
        do{
           middleElement = (l+h)/2;
           if(a[middleElement] == s)
           {
            System.out.println("element found at index  "+middleElement);
            break;
           }
           else if (a[middleElement] > s)
           {
            h = middleElement-1;
           }
           else if (a[middleElement] < s)
           {
            l = middleElement+1;
           }


        }while( a[middleElement] != s);

            
    }
    
}


