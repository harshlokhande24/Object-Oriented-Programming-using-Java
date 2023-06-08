//Assignment 7 OOP
//Harshwardhan Lokhande

import java.util.Scanner;

class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        try {
            if (top == capacity - 1) {
                throw new StackOverflowException("Stack overflow!");
            }
            array[++top] = element;
            System.out.println("Pushed element: " + element);
        } catch (StackOverflowException e) {
            System.out.println("Error: " + e.getErrorCode() + " - " + e.getMessage());
        }
    }

    public int pop() {
        try {
            if (top == -1) {
                throw new StackUnderflowException("Stack underflow!");
            }
            int element = array[top--];
            System.out.println("Popped element: " + element);
            return element;
        } catch (StackUnderflowException e) {
            System.out.println("Error: " + e.getErrorCode() + " - " + e.getMessage());
            return -1; // Return a default value in case of underflow
        }
    }
}

class StackOverflowException extends Exception {
    private static final int ERROR_CODE = 1;

    public StackOverflowException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }
}

class StackUnderflowException extends Exception {
    private static final int ERROR_CODE = 2;

    public StackUnderflowException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }
}

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.print("Please enter the size of the stack:");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        Stack stack = new Stack(size);
        int choice, n1;
        do {
            System.out.println("-------------------------------------");
            System.out.println("Please choose:1.Push 2.Pop 0.Exit");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter the element you want to push:");
                n1 = input.nextInt();
                stack.push(n1);
            } else if (choice == 2) {
                stack.pop();
            } else if (choice == 0) {
                choice = 0;
            }
        } while (choice != 0);
    }
}
