import java.util.Scanner;

public class RotationOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 5, 7, 9 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        int k;
        System.out.println("Enter the key");
        k = sc.nextInt();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < a.length; i++) {
                int first = a[0];
                int last = a[a.length - 1];
                System.out.println("last = " + last);
                System.out.println("first = " + first);
                if (k == 2) {
                    a[0] = last;

                }
                System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
