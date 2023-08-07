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
            int temp = a[i];
            System.out.println("Value of a[i]" + temp);
            for (int j = 1; j < a.length; j++) {
                int temp1 = a[j];
                System.out.println("Value of a[j]" + temp1);
                if (a[j - 1] > temp1) {
                    a[j] = a[j - 1];
                    a[j - 1] = temp1;

                }
                System.out.println(a[j]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array is " + a[i]);
        }
    }

}
