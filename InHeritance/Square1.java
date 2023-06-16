class Square1 extends Rectangle1{
    Square1(){
        System.out.println("this is Square");
    }
    Square1(int a){
        super(a,a);
        System.out.println("Area of Square"+(a*a));

    }
    Square1(int a, int b){
        super(a,b);
        System.out.println("Area of Square "+(a*a));
    }
    public void show(){
        System.out.println("Square");
        super.show();
    }
    public static void main(String args[]){
         Square1 square = new Square1(2,3);
         square.show();

    }
}