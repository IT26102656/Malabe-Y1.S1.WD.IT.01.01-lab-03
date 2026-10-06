import java.util.Scanner;

public class IT26102656Lab3Q2{
	
	public static void main (String[]args){
		
		//Defining variables
		double otAmount, otHours, otHourRate, monthlySalary, totalSalary;
		
		//Create a scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter the monthlySalary
		System.out.print("Enter the monthly salary : ");
		monthlySalary = sc.nextDouble();
		
		//Prompt the user to enter the number of OT hours
		System.out.print("Enter the number of OT hours : ");
		otHours = sc.nextDouble();
		
		//Prompt the user to enter the number of OT hourly rate
		System.out.print("Enter the number of OT hourly rate : ");
		otHourRate = sc.nextDouble();
		
		//Calculate the OT amount and total salary
		otAmount = otHourRate * otHours;
		totalSalary = otAmount + monthlySalary;
		
		//Display the total salary
		System.out.println("The total salary including OT is : "+totalSalary);
	}
}