//Assignment 4 OOP
//Harshwardhan Lokhande

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter Name:    ");
String name = sc.nextLine();
System.out.print("Enter ID:      ");
int id = sc.nextInt();
System.out.print("Enter Address: ");
String addr = sc.next();
System.out.print("Enter Mobile:  ");
long mobile = sc.nextLong();
System.out.print("Enter mailid:  ");
String mail = sc.next();

System.out.print("Your Designation?\n1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor\nYour Choice ");
int oper = sc.nextInt();

switch(oper) {
   
   case 1:
       Programmer Prog = new Programmer(name, id, addr, mail, mobile);
       Prog.showSlip();
       break;
       
   case 2:
       Associate Aoc = new Associate(name, id, addr, mail, mobile);
       Aoc.showSlip();
       break;
       
   case 3:
       Assistant Ait = new Assistant(name, id, addr, mail, mobile);
       Ait.showSlip();
       break;
       
   case 4:
       Professor Prof = new Professor(name, id, addr, mail, mobile);
       Prof.showSlip();
       break;
   
}


}
}

class Employee {
   
    String empName, address, mail_id;
    int emp_id;
    long mobile;
   
    double BasicPay(double BP) {
        double pb = 0.97 * BP;
        return pb;
    }
   
    double DailyA(double BP) {
        double DA = 0.1 * BP;
        return DA;
    }
   
    double HRentalA(double BP) {
        double HRA = 0.12 * BP;
        return HRA;
    }
   
    double GrossS(double P, double DA, double HRA) {
        double GS = P + DA + HRA;
        return GS;
    }
   
    double PFund(double BP) {
        double PF = 0.1 * BP;
        return PF;
    }
   
    double NettS(double GS, double PF) {
        double NS = GS - PF;
        return NS;
    }
   
    void empDetails(String empName, int emp_id, String address, String mail_id, long mobile, String role) {
       
        System.out.println("-------------------------------------");
        System.out.println("          Employee Pay Slip          ");
        System.out.println("-------------------------------------");
        System.out.println("Employee Name:     "+empName);
        System.out.println("Employee ID:       "+emp_id);
        System.out.println("Employee Address:  "+address);
        System.out.println("Employee Mail-ID:  "+mail_id);
        System.out.println("Employee Mobile:   "+mobile);
        System.out.println("Employee Role:     "+role);
        System.out.println("-------------------------------------");
       
    }
   
    void generateSlip(double P, double DA, double HRA, double GS, double PF, double NS) {
       
        System.out.println("Basic Pay:         "+P);
        System.out.println("Daily Allowance:   "+DA);
        System.out.println("Rental Allowance:  "+HRA);
        System.out.println("Gross Salary:      "+GS);
        System.out.println("Provident Fund:    "+PF);
        System.out.println("Nett Salary:       "+NS);
        System.out.println("-------------------------------------");
       
    }
   
}

class Programmer extends Employee {
   
    Programmer (String name, int id, String addr, String mail, long mobile) {
       
        super.empName = name;
        super.emp_id = id;
        super.address = addr;
        super.mail_id = mail;
        super.mobile = mobile;
    }
   
    double BP = 20000;
   
    double P = super.BasicPay(BP);
    double DA = super.DailyA(BP);
    double HRA = super.HRentalA(BP);
    double GS = super.GrossS(P, DA, HRA);
    double PF = super.PFund(BP);
    double NS = super.NettS(GS, PF);
   
    void showSlip() {
       
        super.empDetails(empName, emp_id, address, mail_id, mobile, "Programmer");
        super.generateSlip(P, DA, HRA, GS, PF, NS);
    }
   
}

class Associate extends Employee {
   
    Associate (String name, int id, String addr, String mail, long mobile) {
       
        super.empName = name;
        super.emp_id = id;
        super.address = addr;
        super.mail_id = mail;
        super.mobile = mobile;
    }
   
    double BP = 35000;
   
    double P = super.BasicPay(BP);
    double DA = super.DailyA(BP);
    double HRA = super.HRentalA(BP);
    double GS = super.GrossS(P, DA, HRA);
    double PF = super.PFund(BP);
    double NS = super.NettS(GS, PF);
   
    void showSlip() {
       
        super.empDetails(empName, emp_id, address, mail_id, mobile, "Associate Professor");
        super.generateSlip(P, DA, HRA, GS, PF, NS);
    }
   
}

class Assistant extends Employee {
   
    Assistant (String name, int id, String addr, String mail, long mobile) {
       
        super.empName = name;
        super.emp_id = id;
        super.address = addr;
        super.mail_id = mail;
        super.mobile = mobile;
    }
   
    double BP = 25000;
   
    double P = super.BasicPay(BP);
    double DA = super.DailyA(BP);
    double HRA = super.HRentalA(BP);
    double GS = super.GrossS(P, DA, HRA);
    double PF = super.PFund(BP);
    double NS = super.NettS(GS, PF);
   
    void showSlip() {
       
        super.empDetails(empName, emp_id, address, mail_id, mobile, "Assistant Professor");
        super.generateSlip(P, DA, HRA, GS, PF, NS);
    }
   
}

class Professor extends Employee {
   
    Professor (String name, int id, String addr, String mail, long mobile) {
       
        super.empName = name;
        super.emp_id = id;
        super.address = addr;
        super.mail_id = mail;
        super.mobile = mobile;
    }
   
    double BP = 50000;
   
    double P = super.BasicPay(BP);
    double DA = super.DailyA(BP);
    double HRA = super.HRentalA(BP);
    double GS = super.GrossS(P, DA, HRA);
    double PF = super.PFund(BP);
    double NS = super.NettS(GS, PF);
   
    void showSlip() {
       
        super.empDetails(empName, emp_id, address, mail_id, mobile, "Professor");
        super.generateSlip(P, DA, HRA, GS, PF, NS);
    }
   
}
