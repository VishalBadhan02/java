package searching.sorting;

import java.util.Scanner;

public class InsertionSort1 {
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
            for (int j = 0; j < i && a[j] >f a[i]; j++) {

                System.out.println("value of a[i]" + key);

                a[j] = a[j + 1];
                a[i - 1] = key;

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
