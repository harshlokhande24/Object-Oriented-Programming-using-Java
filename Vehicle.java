//Assignment 6 OOP
//Harshwardhan Lokhande

import java.util.*;
interface Vehicle{
    public void gear_change(int gear);
    public void speed_up(int speed);
    public void apply_brakes();
}
 class Bike implements Vehicle{
    public void gear_change(int gear){
        System.out.println("Gear Changed to : "+ gear);
    }
    public void speed_up(int speed){
        System.out.println("Speed Increased to : "+ speed);
    }
    public void apply_brakes(){
        System.out.println("Left and Right Brake Applied");
    }
 
 }
 class Car implements Vehicle{
    public void gear_change(int gear){
        System.out.println("Gear Changed to : "+ gear);
    }
    public void speed_up(int speed){
        System.out.println("Speed Increased to : "+ speed);
    }
    public void apply_brakes(){
        System.out.println("Normal and Hand Brake Applied");
    }
 
 }
 class Bicycle implements Vehicle{
    public void gear_change(int gear){
        System.out.println("Gear Changed to : "+ gear);
    }
    public void speed_up(int speed){
        System.out.println("Speed Increased to : "+ speed);
    }
    public void apply_brakes(){
        System.out.println("Front and Back Brake Applied");
    }
 
 }
public class Main{
public static void main(String[] args) {
   int x=1;
   Scanner sc= new Scanner(System.in);
   while(x!=0)
   {
       int choice;
            System.out.println("Choose your Vehicle:\n1.Bike\n2.Car\n3.Bicycle\nEnter 0 to end the program");
       choice=sc.nextInt();
       switch(choice)
       {
           case 1:
                   Vehicle BIKE = new Bike();
                   int gear,speed;
                   System.out.println("Which operation you want to perform:\n1.Gear Change\n 2.Speed\n 3.Apply Brake");
                   int choice1;
                   choice1=sc.nextInt();
                   if(choice1==1)
                   {
                       System.out.println("Enter the current gear:");
                       gear=sc.nextInt();
                   BIKE.gear_change(gear);
                   }
                   if(choice1==2)
                   {
                       System.out.println("Enter the Speed");
                       speed=sc.nextInt();
                       BIKE.speed_up(speed);
                   }
                   if(choice1==3)
                   {
                   BIKE.apply_brakes();
                   }
                break;
                case 2:
               Vehicle CAR = new Car();
                   System.out.println("Which operation you want to perform:\n1.Gear Change\n 2.Speed\n 3.Apply Brake");
                   choice1=sc.nextInt();
                   if(choice1==1)
                   {
                       System.out.println("Enter the current gear:");
                       gear=sc.nextInt();
                   CAR.gear_change(gear);
                   }
                   if(choice1==2)
                   {
                       System.out.println("Enter the Speed");
                       speed=sc.nextInt();
                       CAR.speed_up(speed);
                   }
                   if(choice1==3)
                   {
                   CAR.apply_brakes();
                   }
                break;
                case 3:                
               Vehicle BICYCLE = new Bicycle();
                   System.out.println("Which operation you want to perform:\n1.Gear Change\n 2.Speed\n 3.Apply Brake");
                   choice1=sc.nextInt();
                   if(choice1==1)
                   {
                       System.out.println("Enter the current gear:");
                       gear=sc.nextInt();
                   BICYCLE.gear_change(gear);
                   }
                   if(choice1==2)
                   {
                       System.out.println("Enter the Speed");
                       speed=sc.nextInt();
                       BICYCLE.speed_up(speed);
                   }
                   if(choice1==3)
                   {
                   BICYCLE.apply_brakes();
                   }
                break;
       case 0:
               x=choice;
               break;
       }
   
       System.out.println("-------------------------------------------------------------------");
   }
}
}
