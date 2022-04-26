
/*
 *  Author:             Dorothy Hill
 *  Date:               17 February 2022
 *  Description:        This program takes an input file called
 *						"readAndPrint.out and transfers that data
 *						from the original file into java. There are
 *                      then assigned as variables and given new
 *						values. These variables are taken and
 *						calculated together value from the
 *                 		calculation is then added to a new statement
 *						that is formated using printf that appears in
 *						the outFile "readAndPrint.out".
 */

import java.util.*;
import java.io.*;

public class readAndPrint
{
    public static void main(String arg[])
                throws FileNotFoundException
    {
				/* Here the program directory is created to indentify
				*  the file that will be read by java which is an
				*  input file in "readAndPrint.in" and take this
				*  file and output it to "readAndPrint.out.
				*  Scanner is used to bring the input file into java
				*  while PrintWriter is used to output the new
				*  information that has been inputted in the
				*  outFile.printf statement.
				*/

    			Scanner inFile =
    				new Scanner(new FileReader("readAndPrint.in"));
				PrintWriter outFile =
					new PrintWriter("readAndPrint.out");


				// Declared variable from the input file

				int 	Num;
				Double	Num1;
				Double	Num2;
				Double	Num3;
				Double  average;

				/* Variables from the input file "readAndPrint.in"
				*  are imported into java and assigned values and
				*  will be read one after the other using the next
				*  plus the type of value they are. There is one Int
				*  and the rest are doubles.These numbers have been
				*  declared above to ensure their values are assigned
				*  correctly below.
				*/

				Num = inFile.nextInt();
				Num1 = inFile.nextDouble();
				Num2 = inFile.nextDouble();
    			Num3 = inFile.nextDouble();

				/* The doubles from the "readAndPrint.in" are
				*  taken and added together and then are
				*  divided by the first number to produce
				*  a new value called average.
				*/

				average = (Num1 + Num2 + Num3) / Num;


				/* Final output statement printed contains the
				*  numbers from the "readAndPrint.in" that
				*  have been concate together, their numbers
				*  that was calculated above, and formatted
				*  into 2 decimal places. By using the
				*  printf statement and "%.2f".
				*/
				outFile.printf("( " + Num1 + " + " + Num2 +
				              " + " + Num3 + " ) " + "/ " +
				              Num + " = " + "%.2f", average);


				/* Both inFlie and outFile are closed to stop the
				*  from running.
				*/

				inFile.close();
				outFile.close();
    }
}
