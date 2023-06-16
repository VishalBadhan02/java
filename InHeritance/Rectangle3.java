class Rectangle3{
    int length , breadth;
    public void area(int a , int b){
        this.length = a ;
        this.breadth = b;
        System.out.println("area of rectangle "+ a*b);
    }
    Rectangle3(){
        System.out.println("no Parameters");
    }
    Rectangle3(int a , int b){
        System.out.println("Area of rectangle " + a*b);
    }
    Rectangle3(int c){
 
    }
  
    public static void main(String args[]){
        Rectangle3 rectangle = new Rectangle3();
        Rectangle3 rectangle1 = new Rectangle3(2,3);
        Rectangle3 rectangle2 = new Rectangle3(2);
        

    }
}