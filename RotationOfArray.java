import java.util.Scanner;

public class RotationOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a[] = { 1, 2, 5, 7, 9 };
        int a[] = { 1, 2, 5, 7, 9 };

        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        int k;
        System.out.println("Enter the key");
        k = sc.nextInt();
        for (int j = 0; j < k; j++) {

            // Working code
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
