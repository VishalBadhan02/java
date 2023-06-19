class Rectangle3{
    int length , breadth;
    public void area(){
        System.out.println("area of rectangle "+ length * breadth);
    }
    Rectangle3(){
        length = 0;
        System.out.println("no Parameters");
    }
    Rectangle3(int a , int b){
            
    }
    Rectangle3(int c){
 
        this.length = c;
        this.breadth = c;
    }
  
    public static void main(String args[]){
        Rectangle3 rectangle = new Rectangle3();
        Rectangle3 rectangle1 = new Rectangle3(2,3);
        Rectangle3 rectangle2 = new Rectangle3(2);
        
        rectangle.area();

    }
}