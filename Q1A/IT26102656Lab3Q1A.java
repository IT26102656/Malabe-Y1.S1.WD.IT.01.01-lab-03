import java.util.Scanner;

public class IT26102656Lab3Q1A{
	
	public static void main (String[]args){
		
		//Defining variables
		double pricePerKilo, numberOfKilos, totalAmount;
		
		//Create a scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter the price per kilograms of rice
		System.out.print("Enter the price of 1Kg of rice : ");
		pricePerKilo = sc.nextDouble();
		
		//Prompt the user to enter the number of kilograms they want to buy
		System.out.print("Enter the number of kilograms you want to buy : ");
		numberOfKilos = sc.nextDouble();
		
		//Calculate the total amount to be paid
		totalAmount = pricePerKilo * numberOfKilos;
		
		//Display the total amount
		System.out.println("The total amount is : "+totalAmount);
	}
}