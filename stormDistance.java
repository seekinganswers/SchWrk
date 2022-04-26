/*
*  Author: 	       Dorothy Hill
*  Date:	       10 February 2022
*  Description:	   This program will calculate the number of feet
*		   		   per second sound travels by using the information
*		    	   the user input in feet and converting those feet
*		           into miles per second.
*/

import java.util.*;

public class stormDistance
{
	// Declared 2 final variables to be used in the statments below

	static final int feetInMiles  = 5280;
	static final int soundTravels = 1125;

	static Scanner console = new Scanner(System.in);

	public static void main(String[] arg)
	{
		//Declared Variable to be used in statements below

		double	miles;
		double  seconds;


		/* Statement asking the user to enter the number of seconds
		 * between lightning and thunder. Once the user enter this
		 * information, then java will calculate the seconds into
		 * miles to determine how far the storm is away from the
		 * user.
		 */

		System.out.print("Enter number of seconds between lightning"
						 + " and thunder: ");
		seconds = console.nextDouble();

		miles = (seconds * soundTravels)/feetInMiles;
		System.out.println("With " + seconds + " seconds between" +
						   " lightning and thunder, the storm is " +
						   miles + " miles away.");

	}
}

