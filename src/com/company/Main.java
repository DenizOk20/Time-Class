package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.print("Enter the minute: ");
        int minute = scan.nextInt();
        System.out.print("Enter the second: ");
        int second = scan.nextInt();


        System.out.println();

        try{
            time.setTime(hour,minute,second);
        }
        catch (IllegalArgumentException a){
            System.out.printf("Exception : %s",a.getMessage());
            return;
        }


            System.out.printf("Universal Time: %s%n",time.toUnıversalString());
            System.out.printf("Standart Time: %s",time.toString());








    }
}
