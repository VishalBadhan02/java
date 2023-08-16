package searching.sorting;

public class QuickSorting {
    public void pivot(int a[], int start, int end) {
        if (start < end) {
            int p = end;
            pivot(a, start, p);
            pivot(a, start + 1, p);
            sorting(a, start, p);
        }

    }

    public void sorting(int a[], int start, int end) {
        int pi = a[end];
        int i = start - 1;
        for (int j = start; j < a.length; j++) {
            if (a[j] < pi) {
                i++;

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
