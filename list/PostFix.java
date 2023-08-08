package list;

import java.util.Scanner;

public class PostFix {

    boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '(' || c == ')') {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        PostFix postFix = new PostFix();
        String c = "A+B+C*D";
        String a = "";
        for (int i = 0; i < c.length(); i++) {
            if (postFix.isOperator(c.charAt(i)) == false) {
                a.concat(String.valueOf(c.charAt(i)));
                System.out.println(a);
            }
        }
        for (int i = 0; i < c.length(); i++) {
            System.out.println(a);
        }
    }

}
