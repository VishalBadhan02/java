public class AdditionOfOddNo {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum = a[i] + sum;
            }
            // System.out.println(sum);
        }
        System.out.println(sum);
    }

}
