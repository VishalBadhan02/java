import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n = sc.nextInt();
        for (int i = 0 ; i<=n ;i++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(j);
            }
        System.out.println(" ");
        }
    }
}