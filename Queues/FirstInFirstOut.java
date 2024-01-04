package Queues;

import java.util.Scanner;

public class FirstInFirstOut {
    int capacity = 5;
    int a[] = new int[capacity];
    int rear;
    int front;

    FirstInFirstOut(int value) {
        rear = 0;
        front = 0;

        if (rear < capacity) {
            a[rear] = value;
            rear = rear + 1;
        }

    }

    public static void main(String args[]) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        value = sc.nextInt();
        FirstInFirstOut firstInFirstOut = new FirstInFirstOut(value);

    }

}
