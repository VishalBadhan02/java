package interfacesPackage;

public class CurrentAccount implements Account {
    public void deposit() {
        System.out.println("deposit for current ");
    }

    public void withdraw() {
        System.out.println("withdraw for current");
    }

    public void calculateinterest() {
        System.out.println("calculateinterest for current");
    }

    public void viewbalance() {
        System.out.println("viewbalance for current");
    }
}
