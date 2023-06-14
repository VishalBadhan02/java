import java.util.Scanner;
public class FunctionOverloading {
    public int area(int a){
        return a*a;
    }
    public int area(float a ,int b){
        return (int)a*b; 
    }
    public float area(float r){
        return (float) (3.14*r*r);
    }
    public static void main(String args[]){
        FunctionOverloading fo = new FunctionOverloading();
        fo.area(2);
        fo.area(2.0f,2);
        fo.area(2.0f);
        System.out.println("Area of Square ="+fo.area(2));
        System.out.println("Area of Rectangle= "+fo.area(2.0f,2));
        System.out.println("Area of Circle= "+fo.area(2.0f));


    }
}