package abstraction;

import java.util.Scanner;

public class StudentB extends Marks {
    public void getPercentage() {
        int a, b, c, e, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all subjects");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        e = sc.nextInt();
        d = ((a + b + c + e) * (100 / 400));
        System.out.println("Total percentage is " + d);
    }

    public static void main(String args[]) {
        StudentB studentB = new StudentB();
        StudentA studentA = new StudentA();
        studentB.getPercentage();
        studentA.getPercentage();
    }

}
