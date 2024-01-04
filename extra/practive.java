import java.util.Scanner;

public class practive {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum = a[i] + sum;

            }

        }
        System.out.println(sum);
    }

}
