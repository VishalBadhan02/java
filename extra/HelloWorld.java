public class HelloWorld {
    String c = "Hello"; // array of characters
    // java default values

    void DummyFunction() {
        System.out.println("In dummy function");
    }

    public static void main(String args[]) {
        int a = 10, b = 30;
        float c = 45.6f;
        int d = a + b + (int) c;
        int e = (int) (a + b + c);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.DummyFunction();
        System.out.println("in Hello World Function a + b  " + (a + b));
        System.out.println("a <b && b > a " + (a < b && b > a));
        System.out.println("in a < b " + (a < b));

    }

}
// 567.456
// 567
// decimal part 456

// type casting
// Wide
// Narrow
// Implicit
// Explicit
// arithmetic operators +, -, *, /, %
// Relational Operators >, <. <=, >=, ==, !=
// Logical operators &&, ||, !
