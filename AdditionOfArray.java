import java.util.Scanner;
class AdditionOfArray{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n ,k;
    System.out.println("Enter the length of row");
    n = sc.nextInt();
    System.out.println("Enter the length of column");
    k = sc.nextInt();
    int [][] a = new int[n][k];
    for(int i = 0 ; i<n ; i++){
        for (int j=0 ; j<k ;j++){
            System.out.println("Enter the value of cloumn");
            a[i][j]= sc.nextInt();
        }
    System.out.println("Enter the elements of Row");
  //  a[i] = sc.nextInt();   
    }
}
}