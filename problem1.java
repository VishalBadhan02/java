import java.util.Scanner;

public class problem1 {
    public static void main(String args[]) {
        int c;
        float e, b;
        System.out.println("enter the Value to split");
        Scanner sc = new Scanner(System.in);
        b = sc.nextFloat();
        c = (int) b;
        System.out.println(c);
        e = b - (int) c;
        System.out.println(e);
    }

}
