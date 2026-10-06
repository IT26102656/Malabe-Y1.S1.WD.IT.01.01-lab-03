import java.util.Scanner;

public class IT26102656Lab3Q3{
	
	public static void main (String[]args){
		
		//Defining variables
		int n5000 = 0;
		int n1000 = 0;
		int n500 = 0;
		int n200 = 0;
		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int n5 = 0;
		int n2 = 0;
		int n1 = 0;
		
		//Create a scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter the amount that need to be print
		System.out.print("Enter the Rupee amount : ");
		int amount = sc.nextInt();
		
		System.out.println();
		
		
		//Calculation and output
		
		n5000 = amount / 5000;
		amount = amount % 5000;
		System.out.println("5000 Notes - "+n5000);
		
		n1000 = amount / 1000;
		amount = amount % 1000;
		System.out.println("1000 Notes - "+n1000);
		
		n500 = amount / 500;
		amount = amount % 500;
		System.out.println("500 Notes - "+n500);
		
		n200 = amount / 200;
		amount = amount % 200;
		System.out.println("200 Notes - "+n200);
		
		n100 = amount / 100;
		amount = amount % 100;
		System.out.println("100 Notes - "+n100);
		
		n50 = amount / 50;
		amount = amount % 50;
		System.out.println("50 Notes - "+n50);
		
		n20 = amount / 20;
		amount = amount % 20;
		System.out.println("20 Notes - "+n20);
		
		n10 = amount / 10;
		amount = amount % 10;
		System.out.println("10 Notes - "+n10);
		
		n5 = amount / 5;
		amount = amount % 5;
		System.out.println("05 Notes - "+n5);
		
		n2 = amount / 2;
		amount = amount % 2;
		System.out.println("02 Notes - "+n2);
		
		n1 = amount / 1;
		amount = amount % 1;
		System.out.println("01 Notes - "+n1);
	
	
	}
}