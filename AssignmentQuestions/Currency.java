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

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Enter the cmount you want to pay");
        int amount = sc.nextInt();

        System.out.println("a.length " + a.length);
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < a.length; i++) {

            if (amount >= a[i]) {
                int temp1 = amount / a[i];
                int temp2 = (amount - (temp1 * a[i]));
                System.out.println("Temp2 " + temp2);
                amount = temp2;
                System.out.println("new amount " + amount);
                System.out.println(a[i] + ":" + temp1);
            }

        }

    }

}
