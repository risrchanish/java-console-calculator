package calculator;

import java.util.Scanner;

/*
 * Create a basic console based calculator
 
  1.Create methods for addition, subtraction, multiplication, division.
  2.Use Scanner to get user input.
  3.Use a loop to allow multiple calculations until the user exits
  
 */

public class BasicCalculator {
	
	public static void initialMessages()
	{
		System.out.println("Welcome to Calculator App\n");
		
		System.out.println("This a console based calculator available with below instructions: \n");
		
		System.out.println("Press 1 to perform Addition\n");
		
		System.out.println("Press 2 to perform Subtraction\n");
		
		System.out.println("Press 3 to perform Multiplication\n");
		
		System.out.println("Press 4 to perform Division\n");
		
		System.out.println("Press 5 to Exit\n");
			
	}
	
	public static double addition(double a, double b)
	{
		return a + b;
	}
	
	public static double subtraction(double a, double b)
	{
		return a - b;
	}
	
	public static double multiplication(double a, double b)
	{
		return a*b;
	}
	
	public static double division(double a, double b)
	{
		if(b == 0)
		{
			System.out.println("Error!! Division by zero");
			
			return Double.NaN;
		}
		
		return a/b;
	}

	public static void main(String[] args) {
		
		initialMessages();
		
		Scanner userInput = new Scanner(System.in);
		
		// taken boolean for continuous loop
		boolean run = true;
		
		while(run)
		{
			System.out.println("Enter your choice in between 1 to 5");
			int choice = userInput.nextInt();
			
		// Handling the edge cases for choice < 1 and >= 5
			
			if(choice == 5)
			{
				System.out.println("You want to exit, Good Bye!!");
				break;
			}
			
			else if(choice > 5 || choice <= 0)
			{
				System.out.println("Invalid choice!! Please select between 1 to 5 \n");
				continue;
			}
			
			// Now, valid calculations 
			
			else
			{
				if(choice == 1)
				{
					System.out.println("You chose Addition. Please enter your numbers \n");
				}
				else if(choice == 2)
				{
					System.out.println("You chose Subtraction. Please enter your numbers \n");
				}
				
				else if(choice == 3)
				{
					System.out.println("You chose Multiplication. Please enter your numbers \n");
				}
				
				else {
					System.out.println("You chose Division. Please enter your numbers. Avoid zero for the second number \n");
				}
			
				System.out.println("Enter 1st number: ");
				double firstNumber = userInput.nextDouble();
			
				System.out.println("Enter second number: ");
				double secondNumber = userInput.nextDouble();
			
				Double result = 0.0;
				String operation = "";
				
				switch(choice)
				{
					case 1 -> { 
						operation = "Addition";
						result = addition(firstNumber, secondNumber);
						
					}
					case 2 -> { 
						operation = "Subtraction";
						result = subtraction(firstNumber, secondNumber);
						
					}
					case 3 -> { 
						operation = "Multiplication";
						result = multiplication(firstNumber, secondNumber);
						
						
					}
					case 4 -> {
						operation = "Division";
						result = division(firstNumber, secondNumber);
					}
					
				}
				
				System.out.println(operation +": "+result+"\n");
			}
			
		}
		
		userInput.close();
		
	}

}
