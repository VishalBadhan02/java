public class Functions{
    public void noargumentsnoreturn(){
        System.out.println("with noargumentsnoreturn");
    }
    public void withargumnetsnoreturn(int a){
        System.out.println("Withargumentsnoreturn");
   
    }
    public int noargumentsreturn(){
        System.out.println("noargumentsreturn");
        return 0;
    }
    public int withargumentsreturn(int b){
        System.out.println("withargumentsreturn");
        return 0;
    }
    public static void main(String args[]){
        Functions function = new Functions();
        function.noargumentsnoreturn();
        function.withargumnetsnoreturn(4);
        function.noargumentsreturn();
        function.withargumentsreturn(5);
        

    }
}