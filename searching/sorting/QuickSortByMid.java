package searching.sorting;

public class QuickSortByMid {
    public void pivot(int a[], int low, int high) {
        int mid = (low + high) / 2;
        pivot(a, low, mid);
        pivot(a, mid + 1, high);
        sorting(a, low, high, mid);

    }

    public void sorting(int a[], int low, int high, int mid) {
        int midd = a[mid];
        int i = low;
        int j = high;
        // for (int i = low; i < high; i++) {
        while (a[i] <= midd) {
            i++;
        }

        while (a[j] > midd) {
            j--;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        // }
    }

    public static void main(String args[]) {
        QuickSortByMid quickSortByMid = new QuickSortByMid();
        int a[] = { 54, 25, 67, 105, 12, 14 };
        int h = a.length - 1;
        quickSortByMid.pivot(a, 0, h);
    }

}
