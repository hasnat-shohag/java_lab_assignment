// write a program that prompts the user to enter the minutes(e.g., 1 billion), and displays the numbers of years and days for the minutes.
// for simplicity, assume a year has 365 days.

import java.util.Scanner;

public class no_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int minutes;
        minutes = sc.nextInt();
        int years = minutes/(365*24*60);
        int temp = minutes % (365*24*60);
        int days = temp / (60*24);
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}
