package searching.sorting;

public class QuickSorting {
    public void pivot(int a[], int start, int end) {
        if (start < end) {
            int p = end;
            pivot(a, start, p);
            pivot(a, start + 1, p);

        }

    }

    public void sorting(int a[], int start, int end) {
        int i = start;
        int j = end;
        int l = 0;
        int left[] = new int[l];
        for (i = 0; i < a.length; i++) {
            if (a[i] < end) {
                left[l] = a[i];
                l++;
            }
            if (a[i] > end) {
                a[i] = end;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 77, 35, 44, 15, 101, 5 };
        int start = 0;
        int end = a.length - 1;

        QuickSorting quickSorting = new QuickSorting();
        quickSorting.pivot(a, start, end);
    }

}
