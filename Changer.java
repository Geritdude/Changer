package coinner;

import java.util.Scanner;

public class Changer {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int dollars, halfdollars, quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		/*Gosh! So much of this doesn't depend on math, but a knowledge of 
		 * how Java's compiler is going to understand what you've given it and 
		 * exploiting that. For instance, 'total' is given by the users
		 * keyboard input. So let's let total = 516.
		 * Then, we are given 'dollars = total / 100;'.
		 * Because 'total' is an integer (516), when we divide it by 100, the 
		 * java compiler give us the (integer) number of times 100 goes into 
		 * five without going over, i.e 5, so dollars = 5.
		 * then 'whatsLeft = total % 100'. This means whatsLeft = the remainder
		 * given when we divide 516 / 100, i.e 16. So whatsLeft = 16.
		 * Next, 'halfdollars = whatsLeft / 50;'. Since, 'whatsleft' and 50 are
		 * both integers, and whatsLeft < 50, then 0 < whatsLeft / 50 < 1. But 
		 * the Java compiler "wants" whatLeft/50 to be an integer, so it 
		 * outputs 0, rather than a decimal. Then whatsLeft%50 also wants to give
		 * an integer, so again, we get a 0. Etc, etc. until we finally reach
		 * a point where we can get back to integer division with integer remainders.
		 * That's kind of cool. There is technical knowledge
		 * as well as mathematical knowledge at work here.*/
		
		System.out.print("How many cents do you have?");
		total = keyboard.nextInt();
		
		dollars = total / 100;
		whatsLeft = total % 100;
		
		halfdollars = whatsLeft / 50;
		whatsLeft = whatsLeft % 50;
		
		quarters = whatsLeft / 25;
		whatsLeft = total % 25;
		
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		nickels =  whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(dollars + " dollars.");
		System.out.println(halfdollars + " half-dollars.");
		System.out.println(quarters + " quarters.");
		System.out.println(dimes + " dimes.");
		System.out.println(nickels + " nickels.");
		System.out.println(cents + " cents.");
		
		keyboard.close();
	}
}
