/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;
/**
 *
 * @author Earnest Bukenya
 */
import java.util.Scanner; // Import Scanner class to read user input as we expect input from the keyboard 
public class leapmonth {// Define the class "LeapMonth"
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt the user to enter a year
        System.out.print("Enter a year: (for example 2012, 1997)  ");
        int year = scanner.nextInt(); // Read the year entered by the user

        // Prompt the user to enter a month
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt(); // Read the month entered by the user

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        // Check if the given month is February and it's a leap year
        if (isLeapYear && month == 2) {
            System.out.println("The month is a leap month.");
        } else if (month == 2) {
            System.out.println("The month is February, but it's not a leap month.");
        } else {
            System.out.println("The month is not a leap month.");
        }
    }
}

