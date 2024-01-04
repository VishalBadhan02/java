public class mergingandsorting {
    public static void main(String args[]) {
        int a[] = { 1, 5, 9, 10, 15, 20 };
        int b[] = { 2, 3, 8, 13 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {

                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;

                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i] < b[j]) {
                    int temp1 = b[i];
                    b[i] = b[j];
                    b[j] = temp1;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
