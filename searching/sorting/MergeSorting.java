package searching.sorting;

import java.util.Scanner;

public class MergeSorting {
    public void divide(int a[], int low, int high) {
        if (low < high) {
            int m = low + high / 2;
            divide(a, low, m);
            divide(a, m + 1, high);
            sort(a, low, high, m);
        }
    }

    public void sort(int a[], int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int d = 0;

        int merge[] = new int[d];
        while (i <= mid && j <= high) {
            if (a[i] > a[j]) {
                merge[d] = a[j];
                d++;
                j++;

            } else {
                merge[d] = a[i];
                d++;
                i++;
            }

        }
        while (i <= mid) {
            merge[d] = a[i];
            d++;
            i++;
        }
        while (j <= high) {
            merge[d] = a[j];
            d++;
            j++;
        }
        for (int p = 0; p < merge.length; p++) {
            for (int q = 0; q < a.length; q++) {
                merge[p] = a[q];
            }
        }

    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();
        }
        int h = a.length - 1;
        int l = 0;

        MergeSorting mergeSorting = new MergeSorting();
        mergeSorting.divide(a, l, h);

    }

}
