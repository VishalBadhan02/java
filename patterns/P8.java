import java.util.Scanner;
public class P8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the base number");
        a = sc.nextInt();
        System.out.println("Enter the exponent number");
        b = sc.nextInt();
        double c = Math.pow(a,b);
        System.out.println(c);
    }
}