import java.util.Scanner;

public class Currency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of currency denominations");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the currency Denomination");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the cmount you want to pay");
        int amount = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            if (key % (amount / 50) == 0) {
                System.out.println(+key + ":" + (amount / key));
            } else if (key % (amount / 100) == 0) {
                System.out.println(+key + ":" + (amount / key));
            }
        }

    }
}