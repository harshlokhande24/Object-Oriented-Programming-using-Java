//Assignment 5 OOP 
//Harshwardhan Lokhande

import java.util.*;
abstract class shape {
    double l, b;
    abstract public void area();

}
class rect extends shape {
    Scanner sc = new Scanner(System.in);
    public void area() {
        System.out.println("Enter Length and Breadth:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Area of rectangle is: " + (l * b));
    }
}
class tri extends shape {
    Scanner sc = new Scanner(System.in);
    public void area() {
        System.out.println("Enter Height and Base:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Area of Triangle is: " + (l * b * 0.5));
    }
}

public class Menu {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        shape s;
        rect r = new rect();
        tri t = new tri();
        do {
            System.out.println("Enter shape whose area is to be calculated: \n1. Rectangle\n2. Triangle");

            int ch = sc.nextInt();
            switch (ch) {
            case 1:
                s = r;
                s.area();
                break;
            case 2:
                s = t;
                s.area();
                break;
            default:
                System.out.println("Invalid choice");
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("To continue please press 1 else press 0");
            y = sc.nextInt();
        } while (y == 1);
    }
}
