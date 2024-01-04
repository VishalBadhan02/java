package linkedlist;

public class SingleLink {
    int value;
    SingleLink singleLink;

    SingleLink(int value, SingleLink singleLink) {
        this.value = value;
        this.singleLink = singleLink;
    }

    public static void main(String args[]) {
        SingleLink third = new SingleLink(3, null);
        SingleLink second = new SingleLink(2, third);
        SingleLink first = new SingleLink(1, second);

    }

}
