import java.util.Scanner;
class Employee{
    String  firstname,
            lastname;
     int    basesalary,
            bonus;
    public void employee(){
        Scanner sc = new Scanner(System.in);
        int f ;
        System.out.println("Enter the number of employee in company");
        f = sc.nextInt();

        String [] name = new String[f];
        for(int i = 0 ; i<f ; i++)
        {
            System.out.println("Enter the information of employee "+(i+1));
            name[i] = sc.nextLine();
            System.out.println("enter the first name");
            firstname = sc.nextLine();
            System.out.println("Enter the last name");
            lastname = sc.nextLine();
            System.out.println("Enter the base salary");
            basesalary = sc.nextInt();
            System.out.println("Enter the bonus");
            bonus = sc.nextInt();
            int salary,days;
            System.out.println("Enter the number of days");
            days = sc.nextInt();
    
            salary = this.basesalary*days + this.bonus;
            System.out.println("Salary of Employee "+salary);
    
        }
     System.out.println("Thank You");    
        
     
    }
    
    
    public static void main(String args[]){
        Employee employee1 = new Employee();
        employee1.employee();
       
    }
        
}