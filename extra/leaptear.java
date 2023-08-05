import java.util.Scanner;

public class leaptear {
public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    n = sc.nextInt();
    if(n%4==0){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }
}
}
    
