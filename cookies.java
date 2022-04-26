/*
*  Author:			Dorothy Hill
*  Date:			1 March 2022
*  Description:		This program will prompt the user to input a
*					total number of cookies. Then the program will
*					output the total number of boxes and the
*					total number of containers to ship the
*					cookies in. It will also provide the user
*					with leftover values of those cookies
*					that do not fit into a box or container.
*
*/



import java.util.*;

public class cookies
{
	//Scanner is used to get user input below

	static Scanner console = new Scanner(System.in);

	public static void main(String arg[])
	{

		/* Declared variables with 2 variable having
		 * values to be used below in arithmetic
		 * equations and if statements.
		*/

		int 	cookies;
		int 	boxCookies = 24;
		int		containerCookies = 75;
		int 	totalBox;
		int		leftoverBox;
		int		totalContainer;
		int		leftoverCookies;



		// User is prompted to enter a number of cookies

		System.out.print("Enter the total number of cookies: ");
		cookies = console.nextInt();


		/* The user input have been calculated to determine how many
		 * can be contained within a box and a container. As well as
		 * the number of boxes and containers that are leftover from
		 * the boxes and containers.
		*/

		/* Calculates the total number of boxes that has 24 cookies
		 * inside.
		*/

		totalBox = (int) (cookies / boxCookies);


		// Calculates the leftover cookies
		leftoverCookies = (int) (cookies - (boxCookies * totalBox));


		/* Calculates the total number of containers which hold 75
		 * box of cookies.
		*/

		totalContainer = totalBox / containerCookies;

		/* Calculates if there are any remainding boxes that
		 * do not fit into a container as leftover boxes
		*/

		leftoverBox = totalContainer % containerCookies;

		/* Total number of boxes is subtracted from leftoverBox
		 * as these boxes do not fit into the totalBox that
		 * are in the totalContainer
		*/

		totalBox -= leftoverBox;


		/* Here are the if and else statements used to show
		 * the number of containers, boxes, and cookies and
		 * which statement they fit. The statements contain
		 * the assigned variables from the arithmetic
		 * operations above.
		*/


		if (totalContainer >= 1) {
			System.out.println("There are " + totalContainer +
								" full containers with " +
								totalBox + " full boxes to ship");
		}
		else {
		 System.out.println("There are zero full containers " +
							"with zero full boxes shipped");


		}if (leftoverBox >= 1) {
		     System.out.println("There are " + leftoverBox +
		      					 " boxes left over");
	   	   }
	   	  else {
		   	System.out.println("You only have "
		   		      			+ totalBox + " boxes");
		   	}
	   	 if (leftoverCookies >= 1) {
			System.out.println("There are " + leftoverCookies +
								" cookies left over");
		   }
		else {
			System.out.println("There are no left over" +
								" cookies");
		   }

	}

}