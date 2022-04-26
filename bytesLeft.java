/*
 *  Author:             Dorothy Hill
 *  Date:               22 February 2022
 *  Description:        Calculate how many bytes are left to send
 *                      given the total number of MBs to send being
 *                      broken up into a given number of pieces with a
 *                      given number of pieces already sent.
 */
import  java.util.*;

public class    bytesLeft {
    /*
     *  Give us a way to get input from the user.
     */
    public static final Scanner console = new Scanner(System.in);

    public static int	bytesInMB = 1024 * 1024;

    public static void main(String[] args)
    {
        int     MBsToSend;
        int     totalBytes;
        int     bytesLeft;
        int     totalPieces;
        int     piecesSoFar;

        /*
         *  Collect the input from the user.
         */

        System.out.print("Enter the total number of MBs in file: ");
        MBsToSend = console.nextInt();

        System.out.print("Enter number of pieces to send: ");
        totalPieces = console.nextInt();

        System.out.print("Enter number of pieces sent so far: ");
        piecesSoFar = console.nextInt();

        /*
         *  Calculate the actual number of bytes being sent.
         */

        totalBytes = (int)(bytesInMB * MBsToSend); //this correct

		//System.out.println(totalBytes);

        /*
         *  Calculate how many bytes are left to send given that
         *  we're splitting up the total number of bytes into
         *  totalPieces pieces and sending each of those one at a
         *  time and piecesSoFar pieces have already been sent.
         */

		/*  The orginial code was changed here to ensure bytes are
		 *  calculated correctly with the total bytes, pieces sent
		 *  and those leftover. totalBytes are divided by totalPieces
		 *  this number is then multiplied by piecesSoFar and
		 *  subtracted by totalBytes and tur

         bytesLeft = (int) totalBytes - ((totalBytes / totalPieces) *
         			 piecesSoFar);

		 /* Test to ensure the calculations worked in this section.
		  * System.out.println(bytesLeft);
		 */

        /*
         *  Tell the user what's left over after they have been
         *  calculated from above.
         */

        System.out.println("Sending " + totalBytes + " in " +
                           totalPieces + " pieces with " +
                           piecesSoFar +
                           " pieces sent so far leaves\n\t" +
                           bytesLeft + " bytes left to send");

    }
}
