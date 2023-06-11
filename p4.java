import java.util.Scanner;
public class p4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a<b && a<c)
        {
            System.out.println("a is smallest" +a);
        }
        else if(b<c)
        {
            System.out.println("b is smallest" +b);
        }
        else
        {
            System.out.println("c is smallest" +c);
        }
    }
}