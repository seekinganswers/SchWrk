/*
*   Author:		Dorothy Hill
*   Date:		01 February 2022
*   Description:	Caculate the total number of seconds
*			in any give hour, minutes, or seconds
*/

import java.util.*;

public class totalSeconds
{
	public static final Scanner console = new Scanner(System.in);

	public static final int	   minutesInHours = 60 ;
	public static final int	   secondsInMinutes = 60;

	public static void main(String args[])
	{

	 	// Declaration statements for minutes below

	 	int		totalHours;
	 	int		totalMinutes;
	 	int 	totalSeconds;
		int 	finalTotalSeconds;

	 	// Prompt for hours, minutes, and seconds

	 	System.out.print("Enter three integers representing " +
	 					"hours, minutes and seconds: ");

		totalHours = console.nextInt();
		totalMinutes = console.nextInt();
		totalSeconds = console.nextInt();

		/*	Calculations of hours to seconds and minutes
				* 	to seconds
		*/
		finalTotalSeconds = (minutesInHours * totalHours);
		finalTotalSeconds = finalTotalSeconds + totalMinutes;
		finalTotalSeconds = finalTotalSeconds * secondsInMinutes;
		finalTotalSeconds = finalTotalSeconds + totalSeconds;


				// Strings with prompts calculated

		System.out.println(totalHours + "h" + totalMinutes + "m" +
						totalSeconds + "s" + " is " +
						finalTotalSeconds + " seconds");


	 }
}


