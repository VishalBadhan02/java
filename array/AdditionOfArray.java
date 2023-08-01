package array;
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
    }
    int l ,m;
    System.out.println("Enter the length of Second Array : Row ");
    l = sc.nextInt();
    System.out.println("Enter the length of Second Array : column ");
    m = sc.nextInt();
    int [][] b = new int[l][m];
    for(int i = 0 ; i<l ; i++)
    {
        for(int j = 0 ; j<m ;j++)
        {
            System.out.println("Enter the value of column of Second Array");
            b[i][j] = sc.nextInt();
        }
    }
    if(n==l && k==m)
    {
        System.out.println("Sum of array is :" + (a[n][k] + b[l][m]));
    }
    else 
    {
        System.out.println("Addition is not Possible");
    }
}
}