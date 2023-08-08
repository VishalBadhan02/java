package searching.sorting;

import java.util.Scanner;

//inner loop compare smallest 

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
            System.out.println("Index" + index);
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;

                    System.out.println("a[index] =" + a[i]);
                    System.out.println("index in loop =" + a[index]);
                    System.out.println("a[j] =" + a[j]);

                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
