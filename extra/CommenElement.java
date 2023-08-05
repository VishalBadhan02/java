import java.util.Scanner;

public class CommenElement {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of both arrays");
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of a");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of b");
            b[i] = sc.nextInt();
        }
        boolean fn = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                int key = a[i];

                int key1 = b[i];

                if (key == key1) {
                    int d = key;
                    fn = true;
                    c[i] = key;

                } else {
                    fn = false;
                }

            }

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("Comman elements are " + c[i]);
        }

    }
}