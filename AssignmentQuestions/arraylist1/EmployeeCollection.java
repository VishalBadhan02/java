import java.util.Scanner;
import java.util.ArrayList;
class EmployeeCollection{
    String firstname;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeCollection> emplist = new ArrayList<>();
       
        for(int i=0 ;i<2 ;i++)
        {
            emplist.add(new EmployeeCollection());
            System.out.println("Enter the first name");
            emplist.get(i).firstname= sc.next();
        }
    }
}