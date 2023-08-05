import java.util.Scanner;

public class PatternCount1 {
    public void pattern(int i, int a) {
        if (i <= a) {
            pattern1(1, i);
            System.out.println(" ");
            pattern(i + 1, a);
        }
    }

    public void pattern1(int j, int i) {
        if (j <= i) {
            int count = 1;
            int c = count++;
            System.out.print(c);
            pattern1(j + 1, i);
        }
    }

    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        PatternCount1 patternCount1 = new PatternCount1();
        patternCount1.pattern(1, a);

    }

}
