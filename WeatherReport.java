//Assignment 2 OOP 
//Harshwardhan Lokhande

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter no of days:");

        n = in.nextInt();
        double day, htemp, ltemp, amtrain, amtsnow;
        Report[] A = new Report[20];
        Report obj = new Report();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter day number:");
            day = in.nextDouble();
            System.out.println("Enter high temperature:");
            htemp = in.nextDouble();
            System.out.println("Enter low temperature:");
            ltemp = in.nextDouble();
            System.out.println("Enter amount of rain:");
            amtrain = in.nextDouble();
            System.out.println("Enter amount of snow:");
            amtsnow = in.nextDouble();
            A[i] = new Report(day, htemp, ltemp, amtrain, amtsnow);
        }
        obj.avgH(A, n);
        obj.avgL(A, n);
        obj.avgR(A, n);
        obj.avgS(A, n);
        in.close();
    }
}
class Report {
    double d, ht, lt, ar, as;
    Report() {
        d = 0;
        ht = 0;
        lt = 0;
        ar = 0;
        as = 0;
    }
    Report(double day, double htemp, double ltemp, double amtrain,
        double amtsnow) {
        d = day;
        ht = htemp;
        lt = ltemp;
        ar = amtrain;
        as = amtsnow;
    }
    public void avgH(Report[] A, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i].ht;
        }
        double avg = sum / n;
        System.out.println("Avg. High Temp = " + avg);
    }
    public void avgL(Report[] A, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {

            sum += A[i].lt;
        }
        double avg = sum / n;
        System.out.println("Avg. Low Temp = " + avg);
    }
    public void avgR(Report[] A, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i].ar;
        }
        double avg = sum / n;
        System.out.println("Avg. amount of Rain = " + avg);
    }
    public void avgS(Report[] A, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i].as;
        }
        double avg = sum / n;
        System.out.println("Avg. amount of Snow = " + avg);
    }
}
