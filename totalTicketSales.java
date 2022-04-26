/*
*  Author:			Dorothy Hill
*  Date:			19 February 2022
*  Description:		This program will calculate the sale of
*					tickets - box, sideline, premium, and
*					general admissions at the end of a game when the
*					user inputs the amount of tickets sold for
*					each ticket type in a next file. This program
*					will read that file to calculate the each
*					group individual sales to the far right.
*					At the bottom the user will see the totals
*					tickets sold and the grand total made from
*					all ticket sales.
*/

import java.util.*;
import java.io.*;

public class totalTicketSales
{

	public static void main(String[] arg)
				throws FileNotFoundException
	{

		Scanner inFile =
    				new Scanner(new FileReader("ticketsSold.txt"));

		/* Declared Variable to be used in statements below.
		*  The data for these variables are pulled from the
		*  "ticketsSold.txt" in their int for in this
		*	section of the variables.
		*/

		int	boxTicketPrice;
		int boxTicketsSold;
		int	sideLineTicketPrice;
		int	sideLineTicketsSold;
		int	premiumTicketPrice;
		int	premiumTicketsSold;
		int	generalTicketPrice;
		int	generalTicketsSold;
		int totalTicketsSold;

		// This section of the variables presents calculations
		// performed using the data from the text file.

		double boxTicketsTotal;
		double sideLineTicketsTotal;
		double premiumTicketsTotal;
		double generalTickets;
		double grandTotal;
		double bxTicPri;
		double slTicPri;
		double prTicPri;
		double gnTicPri;

		/* This section of is where java reads from the text file
		*  "ticketsSold.txt" to pull the data into the program.
		*	the data type pulled in are all integers.
		*/

		boxTicketPrice = inFile.nextInt();
		boxTicketsSold = inFile.nextInt();
		sideLineTicketPrice = inFile.nextInt();
		sideLineTicketsSold = inFile.nextInt();
		premiumTicketPrice = inFile.nextInt();
		premiumTicketsSold = inFile.nextInt();
		generalTicketPrice = inFile.nextInt();
		generalTicketsSold = inFile.nextInt();


		/* Here the variables are used in arthimetic calculations
		*  and the results of the calculations are assigned into
		*  a new variable name these names are enter above. Also,
		*  these variables were cast from int to doubles as they
		*  are used in the print statements below with using
		*  printf that formats variables labeled Price and Total
		*/

		boxTicketsTotal = (double) (boxTicketPrice * boxTicketsSold);

		sideLineTicketsTotal = (double) (sideLineTicketPrice *
							    sideLineTicketsSold);

		premiumTicketsTotal = (double) (premiumTicketPrice *
							   premiumTicketsSold);

		generalTickets = (double) (generalTicketPrice *
					      generalTicketsSold);

		grandTotal = (double) (boxTicketsTotal +
					  sideLineTicketsTotal +
				      premiumTicketsTotal + generalTickets);

		totalTicketsSold = boxTicketsSold +
						   sideLineTicketsSold +
						   premiumTicketsSold + generalTicketsSold;


		/* These Variables represent the ticket price for each ticket
		*  class. They are cast from int to double and reassigned
		*  a into new variable be used below in the printf
		*  expressions to be formatted.
		*/

		bxTicPri = (double) (boxTicketPrice);
		slTicPri = (double) (sideLineTicketPrice);
		prTicPri = (double) (premiumTicketPrice);
		gnTicPri = (double) (generalTicketPrice);


		/* Printed expressions that have taken the above data and
		* formated that data for each ticket class which includes
		* each groups ticket price, tickets sold, and the total
		* collected from sold tickets. Then the final statement
		* gives a grand total of tickets sold for a groups and
		* the total amount made from all ticket sales
		*/

		System.out.printf("$%6.2f  %5d  $%10.2f%n", bxTicPri,
						  boxTicketsSold, boxTicketsTotal );

		System.out.printf("$%6.2f  %5d  $%10.2f%n", slTicPri,
						  sideLineTicketsSold, sideLineTicketsTotal);

		System.out.printf("$%6.2f  %5d  $%10.2f%n", prTicPri,
						  premiumTicketsSold, premiumTicketsTotal);

		System.out.printf("$%6.2f  %5d  $%10.2f%n", gnTicPri,
						  generalTicketsSold, generalTickets);

		System.out.println("---------------------------");

		System.out.printf("Totals %7d  $%10.2f%n", totalTicketsSold,
						  grandTotal);

		// This statement closes the input file.
		inFile.close();

	}
}
