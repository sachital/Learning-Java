//Write a Java program that takes a year from the user and print whether that year is a leap year or not

import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sy= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sy.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
 
        if (a && (b || c))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
      