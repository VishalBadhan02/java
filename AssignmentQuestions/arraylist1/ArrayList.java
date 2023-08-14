import java.util.Scanner;
import java.util.ArrayList;

class ArrayList1 {
    String firstname, lastname;
    int basesalary, bonus;

    public static void main(String args[]) {
        ArrayList<ArrayList> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Scanner sc = new Scanner(System.in);
            ArrayList temp = new ArrayList();
            System.out.println("Enter name");
            // temp.firstname = sc.next();

            arrayList.add(temp);
        }
    }
}