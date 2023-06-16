class AddAmount{
    int amount = 50;
    AddAmount(){
        System.out.println("No Amount is Added");
    }
    AddAmount(int a ){
        int c = this.amount + a;
        System.out.println("Amount added in piggie bank "+a);
        System.out.println("Total amount added in piggie bank " +c);
    }
    public static void main(String args[]){
        AddAmount addamount = new AddAmount();
        AddAmount addamount1 = new AddAmount(5);

    }
}