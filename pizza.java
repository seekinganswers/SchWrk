/*
*   Author:		Dorothy Hill
*   Date:		27 January 2022
*   Description:	Caculate the cost for the number of pizzas
*			eaten by a person
*/
import java.util.*;

public class pizza
{
	public static final Scanner console = new Scanner(System.in);

	public static final double	  pi = 3.14159;

	public static void main(String args[])
	{
		// Declaration statements for pizza below

		double		pizzaSizeInches;
		int 		pizzaPieces;
		double		pizzaPrice;
		double 		pizzaRadius;
		double 		pizzaArea;
		double		individualPizza;
		double 		individualPrice;
		double		individualInchCost;

		// Prompt for pizza size, pieces, and cost

		System.out.print("Enter size of pizza in inches: ");
		pizzaSizeInches = console.nextDouble();

		System.out.print("Enter number of pieces: ");
		pizzaPieces = console.nextInt();

		System.out.print("Enter the cost in dollars: ");
		pizzaPrice = console.nextDouble();

		/*	Calculations of pizza area, individual pizza size,
		* 	and individual pizza cost.
		*/

		pizzaRadius		= pizzaSizeInches / 2;

		pizzaArea     	= (pizzaRadius * pizzaRadius) * pi;


		individualPizza = pizzaArea / pizzaPieces;

		individualPrice = pizzaPrice / pizzaPieces;

		individualInchCost = pizzaPrice  / pizzaArea ;

		// Strings with prompts calculated

		System.out.println(" Area of a " + pizzaSizeInches + " is " +
							pizzaArea + " square inches");

		System.out.println("Cut into " +  pizzaPieces +
							" pieces, each piece is "
							+ individualPizza + " square inches");

		System.out.println("That's " + "$" + individualPrice + " per piece and " +
							+individualInchCost +  " per square inch");








	}
}