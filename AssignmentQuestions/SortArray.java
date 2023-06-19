import java.util.Scanner;
class SortArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.println("Enter the length of Array");
        n = sc.nextInt();
        String [] a = new String[n];
        for(int i=0 ; i<=n ; i++){
            System.out.println("Enter the elements");
            a[i] = sc.nextLine();
        }
        
    }
}