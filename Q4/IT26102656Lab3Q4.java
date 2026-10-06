import java.util.Scanner;

public class IT26102656Lab3Q4{
	
	public static void main (String[]args){
		
		//Defining variables
		int number, digit1, digit2, digit3, digit4, digit5;
		
		//Create a scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter a 5-digit number
		System.out.print("Enter a five-digit number : ");
		number = sc.nextInt();
		
		
		//Calculation
		
		digit1 = number / 10000;
		number = number % 10000;
		
		digit2 = number / 1000;
		number = number % 1000;
		
		digit3 = number / 100;
		number = number % 100;
		
		digit4 = number / 10;
		number = number % 10;
		
		digit5 = number / 1;
		number = number % 1;
		
		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
	}
}