import java.util.Scanner;
public class problem2 {
    public static void main(String args[] ) {
        int a;
        char b;
        float c;
        double d;
        System.out.println("Enter the value ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.next().charAt(0);
        c = sc.nextFloat();
        d = sc.nextDouble();
        System.out.println("The value is "+a +b +c +d);
    }
}