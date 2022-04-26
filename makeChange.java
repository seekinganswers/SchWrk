/*
*	Author: 		Dorothy Hill
*	Date:			8 February 2022
*	Description:	Shows the cashier how much change to give
*					to a customer in US dollars and cents.
*/

import java.util.*;

public class makeChange
{
	// Declared final variables

	static final double	fiftyDollars  = 50;
	static final double	twentyDollars = 20;
	static final double	tenDollars    = 10;
	static final double	fiveDollars   = 5;
	static final double	oneDollars    = 1;
	static final double	halfDollars   = .50;
	static final double	quarter 	  = .25;
	static final double	dime		  = .10;
	static final double	nickle		  = .05;
	static final double	penny		  = .01;

	static Scanner console = new Scanner(System.in);

	public static void main(String[] arg)
	{
		//Declared variables

		double amount;



		/*Statement prompts the user input to
		*enter amount and calculates the amount into
		*the correct change category to give back
		*/

		System.out.print("Enter the amount you want" +
							" change for: ");
		amount = console.nextDouble();

		System.out.println("Change for $" + amount);

		System.out.println((int)(amount / fiftyDollars) + " $50s");
		amount = amount % fiftyDollars;

		System.out.println((int)(amount / twentyDollars) + " $20s");
		amount = amount % twentyDollars;

		System.out.println((int)(amount / tenDollars) + " $10s");
		amount = amount % tenDollars;

		System.out.println((int)(amount / fiveDollars) + " $5s");
		amount = amount % fiveDollars;

		System.out.println((int)(amount / oneDollars) + " $1s");
		amount = amount % oneDollars;

		System.out.println((int)(amount / halfDollars)
						   + " half-dollars");
		amount = amount % halfDollars;

		System.out.println((int)(amount / quarter) + " quarters");
		amount = amount % quarter;

		System.out.println((int)(amount / dime) + " dimes");
		amount = amount % dime;

		System.out.println((int)(amount / nickle) + " nickles");
		amount = amount % nickle;

		System.out.printf("%.0f pennies%n", (amount / penny));

	}
}