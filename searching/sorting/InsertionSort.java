package searching.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            System.out.println("value of j in loop is " + j);
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
                System.out.println("value of j " + j);
            }
            a[j + 1] = key;
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("sorted array is " + a[i]);
        }
    }

}
// for (int i = 0; i < a.length; i++) {
// System.out.println("\nPass " + i + " firstvariable " + firstvariable + " a[i]
// " + a[i]);
// if (a[i] < firstvariable) {
// int temp = a[i];
// System.out.println("temp value " + temp);
// for (int j = i; j > 0; j--) {
// a[j] = a[j - 1];
// }
// a[0] = temp;
// firstvariable = a[i];
// for (int k = 0; k < a.length; k++) {
// System.out.print(" " + a[k]);
// }

// }

// }
// for (int i = 0; i < a.length; i++) {
// System.out.println("\nFinal Sorted array is " + a[i]);
// }