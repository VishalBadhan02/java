import java.util.Scanner;
public class P7{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a , n , sum=0 , sum1=0;
        System.out.println("how many numbers you want to add");
        a = sc.nextInt();
        for(int i = 0 ; i < a ; i++)
        {
            System.out.println("enetr the no.");
            n = sc.nextInt();
            if(n%2 == 0)
            {
                
                sum = sum + n;
               
            }
            if(n%2 != 0)
            {
                sum1 = sum1 +n;
            }
           
        }
        System.out.println("Sum of even number is "+sum);
        System.out.println("Sum of even number"+sum1);
    }
}
