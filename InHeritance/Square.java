class Square extends Circle {
    public void square(){
        System.out.println("Square is Rectangle");
    }
    public static void main(String args[]){
        Square square = new Square();
        square.shape();
        square.rectangle();
    }
}