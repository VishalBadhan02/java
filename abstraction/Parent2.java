package abstraction;

public class Parent2 extends Parent {
    public void message() {
        System.out.println("This is second subclass");
    }

    public static void main(String args[]) {
        Parent2 parent2 = new Parent2();
        Parent1 parent1 = new Parent1();
        parent2.message();
        parent1.message();
    }

}
