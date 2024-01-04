public class extra {
    public static void main(String args[]) {
        int p = 4, q = 2, r = 4;
        for (r = 5; r <= 6; r++) {
            q = (r + r) + q;
            System.out.println("q=" + q);
            if ((p + r - q) < (6 - p)) {
                p = p + q;
                q = 12 + r;
                System.out.println("p = " + p + "q=" + q);
            }
        }
        System.out.println(p + q);
    }

}
