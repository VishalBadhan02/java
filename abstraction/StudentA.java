package abstraction;

import java.util.Scanner;

public class StudentA extends Marks {
    public void getPercentage() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all subjects");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sum = (a + b + c) * 100;
        double d = (sum / 300);
        System.out.println("Sum " + sum + " Percent  " + d);
        System.out.println("Total percentage id " + d);
    }

    public static void main(String args[]) {
        StudentA studentA = new StudentA();
        studentA.getPercentage();
        ;
    }

}
