import java.util.Scanner;
class AddAmount{
    int amount = 50;
    AddAmount(){
        System.out.println("No Amount is Added");
    }
    AddAmount(int a ){
        amount =a ;
       
    }
    public void Amount(){
        int a;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the amount you wanted to add");
            a = sc.nextInt();
            amount = amount+a;
        }while(a>0);
        System.out.println("Amount added in piggie bank "+a);
        System.out.println("Total amount added in piggie bank "+amount);
    }
    public static void main(String args[]){
        AddAmount addamount = new AddAmount();
        AddAmount addamount1 = new AddAmount(1);
        addamount1.Amount();

    }
}