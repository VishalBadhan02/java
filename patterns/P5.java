public class P5{
    public int gettotal(int a , int b){
        return a+b;
    }
    public static void main(String args[]){
        P5 p5 = new P5();
        p5.gettotal(5,6);
        System.out.println("sum is "+p5.gettotal(5,6));
    }
}