/*
*  Author:			Dorothy Hill
*  Date:			22 February 2022
*  Description: 	The program is used by users Jessica and John
*					to calculate cost fertilizing their back yard
*					using purchases they make at their local
*					nursey. There are two calculations used
*  					one for the cost of the fertilzer and the other
*					for the cost of fertilizer a specific area
*					in their yard based on the information they
*					entered: amount of fertilizer, cost of the
*					bag size, and the area in square feet.
*/

import java.util.*;

public class fertilizer {
    public static final Scanner console = new Scanner(System.in);

    public static void main(String[] arg)
    {
        // Declared variables used for calculations in expressions
        double  cost;
        double  area;
        double  bagSize;


        /* Prompted to enter the fertilizer in pounds, cost, and area
        *  The program will then take this information to perform
        *  arithmetic operations.
        */

        System.out.print("Enter the amount of fertilizer," +
                         " in pounds, in one bag: ");
        bagSize = console.nextDouble();

        System.out.print("Enter the cost of the " + bagSize +
                         " pound fertilizer bag: ");
        cost = console.nextDouble();

        System.out.print("Enter the area, in square feet, that" +
                         " can be fertilized by one bag: ");
        area = console.nextDouble();


        /* Here are the originial calculators with the logic errors.
        * System.out.printf("The cost of the fertilizer per pound" +
                          " is: $%.2f\n", (bagSize / cost));
        * System.out.printf("The cost of fertilizing per square foot"
                             + " is: $%.4f\n", (area / cost));
        */

		/* New calculations that will calculate the correct price of
		*  the cost of fertilizer per pound and the cost of
		*  fertilizing an area. This will provide the users Jessica
		*  and John with the correct cost of planting a garden in
		*  their back yard.
		*/
		System.out.printf("The cost of the fertilizer per pound" +
                          " is: $%.2f\n", (cost / bagSize ));

		System.out.printf("The cost of fertilizing per square foot" +
                          " is: $%.4f\n", (cost / area ));

    }

}
