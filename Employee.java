//Assignment 4 OOP
//Harshwardhan Lokhande

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("Enter your choice: ");

            System.out.println("1. Programmer");

            System.out.println("2. Assistant Professor");

            System.out.println("3. Associate Professor");

            System.out.println("4. Professor");

            System.out.println("5. Exit");

            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

            case 1:

                Programmer p = new Programmer();

                p.getdata();

                p.displaydata();

                break;

            case 2:

                AssistantProfessor ap = new AssistantProfessor();

                ap.getdata();

                ap.displaydata();

                break;

            case 3:

                AssociateProfessor asp = new AssociateProfessor();

                asp.getdata();

                asp.displaydata();

                break;

            case 4:

                Professor prof = new Professor();

                prof.getdata();

                prof.displaydata();

                break;

            case 5:

                System.out.println("Exiting program.");

                break;

            default:

                System.out.println("Invalid choice!");

            }

        }
        while (choice != 5);

    }

}



class Employee {

    String name, address, mailid;

    long num;

    int id;

    double Basic_Pay, DA, HRA, PF;

    Employee() {

        name = "";

        address = "";

        mailid = "";

        num = 0;

        id = 0;

    }
    void getdata() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");

        name = sc.next();

        System.out.println("Enter Address: ");

        address = sc.next();

        System.out.println("Enter Mailid: ");

        mailid = sc.next();

        System.out.println("Enter ID: ");

        id = sc.nextInt();

        System.out.println("Enter Number: ");

        num = sc.nextLong();

        System.out.println("Enter basic pay: ");

        Basic_Pay = sc.nextDouble();

        DA = 0.1 * Basic_Pay;

        HRA = 0.12 * Basic_Pay;

        PF = 0.001 * Basic_Pay;

    }
    void displaydata() {

        double Gross_Salary = Basic_Pay + DA + HRA;

        double Net_Salary = Gross_Salary - PF;

        System.out.println("PAYSLIP:");

        System.out.println("Name: " + name);

        System.out.println("Address: " + address);

        System.out.println("Mailid: " + mailid);

        System.out.println("ID: " + id);

        System.out.println("Number: " + num);

        System.out.println("Basic Pay: " + Basic_Pay);

        System.out.println("DA: " + DA);

        System.out.println("HRA: " + HRA);

        System.out.println("PF: " + PF);

        System.out.println("Gross Salary: " + Gross_Salary);

        System.out.println("Net Salary: " + Net_Salary);

    }

}
class Programmer extends Employee

{

    public void displaydata() {

        super.displaydata();

    }
}
class AssistantProfessor extends Employee

{

    public void displaydata() {

        super.displaydata();

    }
}
class AssociateProfessor extends Employee

{

    public void displaydata() {

        super.displaydata();

    }
}
class Professor extends Employee

{

    public void displaydata() {

        super.displaydata();

    }
}
