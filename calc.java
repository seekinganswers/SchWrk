/*
*  Author:			Dorothy Hill
*  Date:			26 February 2022
*  Description:		This program will calculate user input arithmetic
*					equations and comparison operators. It will then
*					provide the user with the calculations of an
*					arithmetic operations and the comparison
*					statements the user will receive an
*					answer of true or false as the values
*					are entered into the system as
*					boolean values.
*/

import java.util.*;

public class calc
{

	//Scanner is used to get user input below

	static Scanner console = new Scanner(System.in);

	public static void main(String[] arg)
	{
		// Declared variables based on user input

		int			operand1;
		int 		operand2;
		char		operator;
		int			answer1;
		boolean		answer2;


		/*  User is prompted to enter an arithmetic or comparison
		 *  operation that will be evaulated in the statements below.
		 *  The input is seperated and entered into three variables
		 *	two of the variales are integers and the three variable
		 *	is a char that will be converted into its arithmetic or
		 *	comparison operator in the statements below.
		*/

		System.out.print("Enter equation as number operator number: ");
		operand1 = console.nextInt();
		operator = console.next().charAt(0);
		operand2 = console.nextInt();



		/*
		 *  If, else if, and else statements are created to allow the
		 *  program to find where the user input equation matches
		 *  the operands and operator. When the user inpur matches
		 *  a statement below, it will perform the statement, and
		 *	that statment is printed out showing the user an
		 *	answer for the information they inputed.
		*/

		if (operator == '+'){
			answer1 = (operand1 + operand2);
			System.out.println(operand1 +" "+  operator + " " +
							   operand2 + " = " + answer1);
		}

		else if (operator == '-') {
				answer1 = operand1 - operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " = " + answer1);
		}

		else if (operator == '*') {
				answer1 = operand1 * operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " = " + answer1);
		}

		else if (operator == '/') {
				answer1 = operand1 / operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " = " + answer1);
		}

		else if (operator == '%') {
				answer1 = operand1 - operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " = " + answer1);
		}

		else if (operator == '<') {
				answer2 = operand1 < operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " is " + answer2);
		}

		else if (operator == '>') {
				answer2 = operand1 > operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " is " + answer2);
		}

		else  {
				answer2 = operand1 == operand2;
				System.out.println(operand1 +" "+  operator + " " +
								   operand2 + " is " + answer2);
		}


	}
}