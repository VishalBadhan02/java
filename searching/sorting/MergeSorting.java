package searching.sorting;

import java.util.Scanner;

public class MergeSorting {
    public void divide(int a[], int low, int high) {
        if (low < high) {
            int m = (low + high) / 2;
            divide(a, low, m);
            divide(a, m + 1, high);
            sort(a, low, high, m);
        }
    }

    public void sort(int a[], int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int k = low;

        int merge[] = new int[a.length];
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                merge[k] = a[i];
                k++;
                i++;

            } else {
                merge[k] = a[j];
                k++;
                j++;
            }

        }
        while (i <= mid) {
            merge[k] = a[i];
            k++;
            i++;
        }
        while (j <= high) {
            merge[k] = a[j];
            k++;
            j++;
        }
        for (int p = low; p <= high; p++) {
            // merge[p] = a[p];
            a[p] = merge[p];
        }

        display(a);

    }

    public void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t " + a[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // int n;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length");
        // n = sc.nextInt();
        // int a[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter the elements");
        // a[i] = sc.nextInt();
        // }

        int a[] = { 12, 11, 13, 5, 6 };
        int h = a.length - 1;
        int l = 0;

        MergeSorting mergeSorting = new MergeSorting();
        mergeSorting.divide(a, l, h);
        mergeSorting.display(a);

    }

}
