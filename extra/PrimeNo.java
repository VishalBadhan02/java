import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]) {
        int n, count = 0;
        boolean fn = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }

        }
        if (count > 1) {
            System.out.println("not a prime no.");
        } else {
            System.out.println("prime no");
        }
    }
}
