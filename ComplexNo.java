//Assignment 1 OOP 
//Harshwardhan Lokhande

import java.util.Scanner;
public class Complex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num1, num2;
        complex_op object1;
        complex_op object2;
        complex_op cal = new complex_op();
        int ch;
        do {
            System.out.println("...................................................");
            System.out.print("enter the first no.");
            num1 = input.nextFloat();
            num2 = input.nextFloat();
            object1 = new complex_op(num1, num2);
            System.out.print("enter the second no.");
            num1 = input.nextFloat();
            num2 = input.nextFloat();
            object2 = new complex_op(num1, num2);
            System.out.print("\nMENU\n");
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("EXIT(0)\n");
            System.out.print("Enter choice: ");
            ch = input.nextInt();
            switch (ch) {
            case 1:
                cal.AddNumbers(object1, object2);
                break;
            case 2:
                cal.subNumbers(object1, object2);
                break;

            case 3:
                cal.mulNumbers(object1, object2);
                break;
            case 4:
                cal.divNumbers(object1, object2);
                break;
            case 0:
                System.out.print("Exit Successful\n");
                break;
            default:
                System.out.print("Invalid Choice\n");
            }

        }
        while (ch != 0);
        input.close();
    }
}
class complex_op {
    float real, imag;
    complex_op() {
        real = 0;
        imag = 0;
    }
    complex_op(float comp1, float comp2) {
        real = comp1;
        imag = comp2;
    }
    public void AddNumbers(complex_op C1, complex_op C2) {
        float real, imag;
        real = (C1.real + C2.real);
        imag = (C1.imag + C2.imag);
        System.out.println("(" + real + ") + " + "(" + imag + ")i");
    }

    public void subNumbers(complex_op C1, complex_op C2) {
        float real, imag;
        real = (C1.real - C2.real);
        imag = (C1.imag - C2.imag);
        System.out.println("(" + real + ") + " + "(" + imag + ")i");
    }
    public void mulNumbers(complex_op C1, complex_op C2) {
        float real, imag;
        real = (C1.real * C2.real - C1.imag * C2.imag);
        imag = (C1.imag * C2.real + C1.real * C2.imag);
        System.out.println("(" + real + ") + " + "(" + imag + ")i");
    }
    public void divNumbers(complex_op C1, complex_op C2) {
        float real, imag;
        real = (C1.real * C2.real + C1.imag * C2.imag) / (C2.real * C2.real + C2.imag * C2.imag);
        imag = (C1.imag * C2.real - C1.real * C2.imag) / (C2.real * C2.real + C2.imag * C2.imag);
        System.out.println("(" + real + ") + " + "(" + imag + ")i");
    }
}
