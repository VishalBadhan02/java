import java.util.Scanner;

public class zigzag {
    public static void main(String args[]) {
        String s = "ABCDEFGH";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        String a[][] = new String[row][s.length()];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < s.length(); j++) {
                a[i][j] = String.valueOf((s.charAt(i)));

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
