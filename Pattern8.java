import java.util.Scanner;
class Pattern8{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();
        for(int i=n; i>0 ;i--)
        {
            for(int j=i; j<0 ;j--)
            {
                System.out.print(" ");
            }
            for (int k = 0 ;k<n ;k++){
                System.out.print("*");
            }
        System.out.println(" ");
        }
    }
}