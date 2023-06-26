import java.util.Scanner;
class Employee{
    String  firstname,
            lastname;
     int    basesalary,
            bonus;
    public void employee(){
        Scanner sc = new Scanner(System.in);
        int size ;
        System.out.println("Enter the number of employee in company");
        size = sc.nextInt();

        Employee [] employee = new Employee[size];
        for(int i = 0 ; i<size ; i++)
        
        {
             employee[i] = new Employee();
            System.out.println("Enter the information of employee "+(i+1));
            System.out.println("Enter the first name");
            employee[i].firstname = sc.next();
            System.out.println("Enter the last name");
            employee[i].lastname = sc.next();
            System.out.println("Enter the base salary");
            employee[i].basesalary = sc.nextInt();
            System.out.println("Enter the bonus");
            employee[i].bonus = sc.nextInt();

            }
            System.out.println("Enter the Month");
            int month = sc.nextInt();
          for (int i = 0 ; i<size ; i++){
            int salary;
            
            salary = employee[i].basesalary*month + this.bonus;
            switch(month){
                case 1:
                month = 1;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 2:
                month = 2;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*28 + employee[i].bonus));
                break;
                case 3:
                month = 3;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 4:
                month = 4;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*30 + employee[i].bonus));
                break;
                case 5:
                month = 5;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 6:
                month = 6;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*30 + employee[i].bonus));
                break;
                case 7:
                month = 7;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 8:
                month = 8;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 9:
                month = 9;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*30 + employee[i].bonus));
                break;
                case 10:
                month =10;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
                break;
                case 11:
                month = 11;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*30 + employee[i].bonus));
                break;
                case 12:
                month = 12;
                System.out.println("Salary of "+employee[i].firstname+" with " +employee[i].bonus+ " Bonus : "+(salary = employee[i].basesalary*31 + employee[i].bonus));
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