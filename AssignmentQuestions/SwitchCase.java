import java.util.Scanner;
public class SwitchCase{
    public void test(){
        int salary,basesalary,Month,bonus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base salary");
        basesalary= sc.nextInt();
        System.out.println("Enter the bonus");
        bonus = sc.nextInt();
        System.out.println("Enter the month");
        Month= sc.nextInt();
        salary = basesalary*Month + bonus;
        switch(Month){
            case 1 :
            Month = 1;
            System.out.println(salary = (basesalary*31)+bonus);
            break;
            default:
            break;
        }

    }
    public static void main(String args[]){
        SwitchCase switchcase = new SwitchCase();
        switchcase.test();
    }
}