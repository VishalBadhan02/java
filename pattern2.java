import java.util.Scanner;
public class pattern2{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value");
        n = sc.nextInt();
        for(int i = n ; i > 1 ; i--){
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = i ; k < n ; k++)
            {
                System.out.print("*");
            }
          
        System.out.println(" ");
        }
    }
}