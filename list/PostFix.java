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
        String d = "";
        for (int i = 0; i < c.length(); i++) {
            if (postFix.isOperator(c.charAt(i)) == false) {
                a = a.concat(String.valueOf(c.charAt(i)));
                System.out.println(a);

            } else {
                if (d.isEmpty() == false) {
                    a = a.concat(String.valueOf(d.charAt(d.length() - 1)));
                    d = d.substring(0, d.length() - 1);
                }
                d = d.concat(String.valueOf(c.charAt(i)));
                System.out.println(d);

            }
        }
        System.out.println(a);
        System.out.println(d);

    }

}
