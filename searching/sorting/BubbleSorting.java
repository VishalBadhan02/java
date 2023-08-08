package searching.sorting;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (a[j - 1] > a[j]) {
                    int temp1 = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp1;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array is " + a[i]);
        }
    }

}
