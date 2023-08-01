import java.util.Scanner;
class Pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n = sc.nextInt();
        for(int i = 0 ; i<n ;i++){
            for(int j =0 ; j<i ; j++){
            System.out.print(" ");
            }
            for(int k=10 ; k>=2*(i-1) ;k--){
            System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
