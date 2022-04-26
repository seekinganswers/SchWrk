/*
* Author:			Dorothy Hill
* Date:				15 February 2022
* Description:  	This program will prompt the user to enter a
*					phrase or sentence, then three characters
*					that should come from the phrase. The three
*					character's char index are averaged to create
*					a fourth char character with an index that
*					will be pulled from the user entered phrase.
*					Finally, those characters the user entered
*					are then shown to the user where they first
*					appear in the phrase or sentence the user
*					first entered. With the fourth character as
*					the point of reference for the other characters.
*/

import java.util.*;

public class charFind
{
	public static final Scanner console = new Scanner(System.in);

	public static void main(String args[])
	{
		// Declaration Variables

		String  phrase;
		String  characters;
		char	char1;
		char	char2;
		char	char3;
		int		index1;
		int 	index2;
		int 	index3;
		int 	average;
		char	char4;


		/* Statements below prompts the user to enter a sentence
		*  and characters. The user should pull these characters
		*  from the information they entered from the first
		*  prompt.
		*/

		System.out.print("Enter a phrase: ");
		phrase = console.nextLine();

		System.out.print("Enter a set of at least three "
						 + "characters:  ");
		characters = console.nextLine();

		/* Assigned variables expressions using the string method
		*  charAt() and indexOf(), the program needs the location
		*  of the variables as an int and character.
		*/

		char1  = characters.charAt(0);
		char2  = characters.charAt(1);
		char3  = characters.charAt(2);

		index1 = phrase.indexOf(char1);
		index2 = phrase.indexOf(char2);
		index3 = phrase.indexOf(char3);


		/* The arithmetic operation creates the location of the
		*  fourth variable by adding and dividing the three
		* previous variables indexes.
		*/

		average = (index1 + index2 + index3) / 3;


		/* The fourth variable charAt() location comes from the
		*  arithmetic equation above and is used to locate the
		*  character in the original phrase or sentence that
		*  is located in the position.
		*/

		char4 = phrase.charAt(average);


		/* Here is the results and string printed out with all
		*  characters that states where character a fourh
		*  character is located between the three
		*  characters the user entered within their
		*  orignial phrase or sentence.
		*/

		System.out.println("\'" + char4 + "\' " + "is between " +
						   "\'" + char1 + "\' " + "\'" + char2 + "\'"
						   + " \'" + char3 + "\'" + " in " + phrase);

	}
}
