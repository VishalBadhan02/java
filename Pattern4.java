import java.util.Scanner;
class Pattern4{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n = sc.nextInt();
        for(int i = 0 ; i<n ; i++)
        {
            for(int j=0 ; j<i ;j++)
            {
                System.out.print(i);
            }
        System.out.println(" ");
        } 
    }
}