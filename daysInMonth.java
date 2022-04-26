/*
 *  Author:       	Dorothy Hill
 *  Title:        	makeChangePrettier.java
 *  Date:         	3 March 2022
 *  Description:  	Ask the user to input the month and year
 *                	to output the number of days in the month
 *		  			of that year. February has been calculated
 *					to include leap year.
 */

import java.util.*;

public class daysInMonth {

	// Declare an object used to get input from the user.

	static Scanner  console = new Scanner(System.in);



	public static void main (String arg[])
	{

    	 	// Declare constants for the months and year.

    		 int  month;
     		 int  year;
     		 int  n = 28;

     		 // User input statement asking for the month and year
     		 System.out.print("Enter the months as " +
     		 				  "a number between 1-12: ");
     		 month = console.nextInt();

     		 System.out.print("Enter the year: ");
     		 year = console.nextInt();


			/* Below the user input is placed in the correct a switch
			 * statement to see which statement is true. Once the
			 * statement is true it prints out the results. For the
			 * user and the correct month and year. February has
			 * a calculation that includes the equality operators
			*/

     		 switch (month)
     		 {
     		 case 1:
     		 	System.out.println("Month " + month + " of " + year +
     		 						" has 31 days");
     		 	break;

     		case 2:
				if(year % 4 == 0 && (year % 100 != 0 || year % 400
					== 0)) n++;
				System.out.println("Month " + month + " of " + year
									+ " has " + n + " days");
				break;
     		case 3:
		     	System.out.println("Month " + month + " of " + year
		     						+ " has 31 days");
		     	break;
			case 4:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 30 days");
     		 	break;
    		case 5:
         		System.out.println("Month " + month + " of " + year
         							+ " has 31 days");
         		break;
			case 6:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 30 days");
     		 	break;
			case 7:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 31 days");
     		 	break;
  			case 8:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 31 days");
     		 	break;
			case 9:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 30 days");
     		 	break;
			case 10:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 31 days");
     		 	break;
			case 11:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 30 days");
     		 	break;
			case 12:
     		 	System.out.println("Month " + month + " of " + year
     		 						+ " has 31 days");
     		 	break;

 			default:
     		 	System.out.print("There is no month for that number");
     		 }


     	}
}






















