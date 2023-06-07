//Assignment 3 OOP 
//Harshwardhan Lokhande

import java.util.Scanner;
class publication {
    private String title;
    private int price;
    private int copies;
    private int total;
    Scanner sc = new Scanner(System.in);
    public void settitle(String title) {
        this.title = title;
    }
    public void setcopies(int copies) {
        this.copies = copies;
    }
    public String gettitle() {
        return title;
    }
    public int getTotal() {
        return total;
    }
    public int getCopies() {
        return copies;
    }
    public int getprice() {
        return price;
    }
    void read_publ() {

        System.out.println("enter title:");
        title = sc.next();
        System.out.println("enter price:");
        price = sc.nextInt();
        System.out.println("enter copies:");
        copies = sc.nextInt();
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Copies: " + copies);
    }
    void sale_copy(int number) {
        if (number <= copies) { //if customer needed copies are less than available

            copies = copies - number;
            total = total + number * price;
            System.out.println("YOU PURCHASED " + number + " COPIES");
            System.out.println("YOU HAVE TO PAY :" + (price * number));

        } else //if customer needs copies more than available in stock

            System.out.println(" INSUFFICIENT STOCK!");
    }
}
class book extends publication {
    private String author;
    void order_copies(int number) { //increase available copies oF book by ordering

        int x = getCopies() + number;
        setcopies(getCopies() + number); //as data members are private, we access them with the help of methods

        System.out.println("\n\tORDER SUCESSFUL....");
        System.out.println("\tCOPIES AVAILABLE : " + x);
    }
    void read_book() {
        read_publ();
        System.out.println("enter author: ");
        author = sc.next();
    }
    void display_book() {
        display();
        System.out.println("Author: " + author);
    }
}
class magazine extends publication {
    private int order_qty;
    private String issue_date;
    void receive_issue(String new_issue_date) {
        System.out.println("ENTER NEW COPIES ORDERED: ");
        order_qty = sc.nextInt();

        setcopies(order_qty);
        issue_date = new_issue_date;
        System.out.println("THE MAGAZINE " + gettitle() + " WITH ISSUE DATE " + issue_date + " IS AVAILABLE");
    }
    void read_mag() {
        read_publ(); //call to read method defined in publication class

        System.out.println("Enter The Current Issue Date [dd/mm/yyyy]");

        issue_date = sc.next();
    }
    void display_mag() { //display method to display
        display();
        System.out.println("Issue Date: " + issue_date);
    }
}
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b = new book();
        magazine m = new magazine();
        int outer;
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Book 2. Magazine 3. Total sale amount 4. Revenue");
            int k = sc.nextInt();
            int a;
            aa:
                if (k == 1) {
                    do {
                        int c;
                        System.out.println("ENTER CHOICE FOR BOOK");
                        System.out.println("1. Read 2. Display 3. Sale copies 4. Order copies");
                        c = sc.nextInt();
                        switch (c) {
                        case 1:
                            b.read_book();
                            break;
                        case 2:
                            b.display_book();
                            break;
                        case 3:
                            System.out.println("Enter the number of copies you want:");
                            int n1 = sc.nextInt();
                            b.sale_copy(n1);
                            break;
                        case 4:

                            System.out.println("Enter the number of copies you want to order:");
                            int n2 = sc.nextInt();
                            b.order_copies(n2);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                        }
                        System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
                        a = sc.nextInt();
                        if (a == 0)
                            break aa;
                    } while (a == 1);
                }
            else if (k == 2) {
                mm: do {
                    int d;
                    System.out.println("ENTER CHOICE FOR MAGAZINE");

                    System.out.println("1.Read 2.Display 3.Sale copies 4.Order copies");
                    d = sc.nextInt();
                    switch (d) {
                    case 1:
                        m.read_mag();
                        break;
                    case 2:
                        m.display_mag();
                        break;
                    case 3:
                        System.out.println("Enter the number of copies you want:");

                        int n3 = sc.nextInt();
                        m.sale_copy(n3);
                        break;
                    case 4:
                        System.out.println("Enter the issue date [dd/mm/yyyy]:");

                        String date = sc.next();
                        m.receive_issue(date);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                    }
                    System.out.println("Do you want to continue with magazine section[1/0]\n\t1.YES \t\t0.NO");

                    a = sc.nextInt();
                    if (a == 0)
                        break mm;
                } while (a == 1);

            }
            else if (k == 3) {
                System.out.println("Total amount to be paid: " + (b.getCopies() * b.getprice() + m.getCopies() * m.getprice()));
            } else if (k == 4) {
                System.out.println("Total revenue: " + (b.getCopies() * b.getprice() + m.getCopies() * m.getprice()));
            } else
                System.out.println("Invalid choice");
            System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION?\n\t1.CONTINUE \t0.TERMINATE");
            outer = sc.nextInt();
        } while (outer != 0);
        sc.close();
    }
}
