import java.util.Scanner;

public class RightAngle {
    public static void main(String args[]) {
        int n, Count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(Count++);
            }
            System.out.println(" ");
        }
    }

}
