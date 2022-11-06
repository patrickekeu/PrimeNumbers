import java.util.Scanner;
//Patrick Ekeu
//Lab 6: More Loops
//October 5, 2020


public class MoreLoops {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String more; //declaring a string to ask the user for more input

		do 
		{
			System.out.print("Enter a positive integer --> ");
			int number = input.nextInt();

			while (number < 1) //code only done if the user puts in a negative number
			{
				System.out.println("Invalid number. Please try again");
				System.out.print("Enter a positive integer --> ");
				number = input.nextInt();
			}

			if (isPrime(number)) 
			{
				System.out.println(number + " is a prime number"); //output message when the user's input is a prime number
			}
			else
			{
				System.out.println(number + " is NOT a prime number"); //output message when the user's input is a composite number
			}

			System.out.println("Do you have another number to check (y/n)?"); //asking the user if he wants another number to check
			more = input.next();

		}
		while(more.contains("y"));

		System.out.println("Thank you for using my program!");
		
		input.close();
	}

	public static boolean isPrime(int x)

	{
		int d = 3; // first value that the user's number gets divided to
		int div; // the result of the division
		
		if (x % 2 == 0) 
		{
			if (x == 2) 
			{
				return true; //2 is the only even prime number
			}
			else
			{
				return false; //if the user's number is an even number that is not 2, it is a composite number
			}
		}
		else
		{
			while ( !( x % d == 0) && (d <= Math.sqrt(x)))
			{
				div = x / d;
				d += 2; // add two to d for the values 5, 7, 9, 11...
			}

			if (d > Math.sqrt(x)) 
			{
				return true; // number is prime if d goes greater than the square root of the user's number
			}
			if (x % d == 0)
			{
				return false; // number is composite if a value divides evenly into the user's number
			}

		}
		return false; //the default result is false
	}
	
}
