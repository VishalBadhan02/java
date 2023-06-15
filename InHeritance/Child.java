class Child extends Parent {
    public void Child1(){
        System.out.println("This is child class");
    }

    public static void main(String args[]) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.Parent1();
        child.Child1();
        child.Parent1();
    }
}