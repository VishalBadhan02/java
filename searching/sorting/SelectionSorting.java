package searching.sorting;

import java.util.Scanner;

//The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion 
//of the list and swaps it with the first element of the unsorted part. This process is repeated
//for the remaining unsorted portion until the entire list is sorted. 

public class SelectionSorting {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;

                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Sorted array is " + a[i]);
        }
    }

}
