// Write a program that reads in investment amount, annual interest rate, and numbers of years, and displays the future investment value using the following formula: 
// FutureInvestmentValue = investmentAmount * (1+monthlyInterestRate)^numbeOfYears*12
// For example, if you enter amount 1000, annual interest rate 3.25%, and the numbers of years 1, the future investment value if 1032.98

import java.util.Scanner;
import java.lang.Math;

public class no_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = sc.nextDouble();
		monthlyInterestRate /= (12*100);

		System.out.print("Enter number of years: ");
		int years = sc.nextInt();

		double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);

		System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
