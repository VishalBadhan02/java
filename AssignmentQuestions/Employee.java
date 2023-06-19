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
            System.out.println("Enter the first name");
            firstname = sc.nextLine();
            System.out.println("Enter the last name");
            lastname = sc.nextLine();
            System.out.println("Enter the base salary");
            basesalary = sc.nextInt();
            System.out.println("Enter the bonus");
            bonus = sc.nextInt();
            int salary,Month;
            System.out.println("Enter the Month");
            Month = sc.nextInt();
            salary = this.basesalary*Month + this.bonus;
            switch(Month){
                case 1:
                Month = 1;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 2:
                Month = 2;
                System.out.println("Salary of Employee "+(salary = this.basesalary*28 + this.bonus));
                break;
                case 3:
                Month = 3;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 4:
                Month = 4;
                System.out.println("Salary of Employee "+(salary = this.basesalary*30 + this.bonus));
                break;
                case 5:
                Month = 5;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 6:
                Month = 6;
                System.out.println("Salary of Employee "+(salary = this.basesalary*30 + this.bonus));
                break;
                case 7:
                Month = 7;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 8:
                Month = 8;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 9:
                Month = 9;
                System.out.println("Salary of Employee "+(salary = this.basesalary*30 + this.bonus));
                break;
                case 10:
                Month =10;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                case 11:
                Month = 11;
                System.out.println("Salary of Employee "+(salary = this.basesalary*30 + this.bonus));
                break;
                case 12:
                Month = 12;
                System.out.println("Salary of Employee "+(salary = this.basesalary*31 + this.bonus));
                break;
                default:
                System.out.println("Please enter the valid month");
            }
           
            
    
        }
     System.out.println("---------");
     System.out.println("Thank You");    
     System.out.println("---------");
     
    }
    
    
    public static void main(String args[]){
        Employee employee1 = new Employee();
        employee1.employee();
       
    }
        
}