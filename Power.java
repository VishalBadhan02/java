import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        int a, b, n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        a = sc.nextInt();
        System.out.println("Enter the Exponent ");
        b = sc.nextInt();
        for (int i = b; i > 0; i--) {
            n = a * n;
        }
        System.out.println(n);
    }

}
