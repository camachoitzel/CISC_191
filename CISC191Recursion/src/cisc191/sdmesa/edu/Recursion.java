package cisc191.sdmesa.edu;

import java.util.*;

/**
 * Lead Author(s): Itzel Camacho
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date: 1
 * 
 * Responsibilities of class: Practice various methods of creating recursive methods
 * 
 */
public class Recursion
{
	/**
	 * Add n to the sum of all integers less than n (but not negative)
	 * @param n
	 * @return the sum of n+(n-1)+...+1
	 */
	public static int addLess(final int n)
	{
		if (n == 0)
		{
			// Base case
			return 0;
		}
		else
		{
			// Recursive case
			//some partial result and a CALL to the method
			//the method call must alter the param in some fashion
			return n + addLess(n-1);
		}
	}
	
	/**
	 * Multiply all integers n and less (but not negative)
	 * @param n
	 * @return the product n*(n-1)*...*1
	 */
	public static int multiplyLess(final int n)
	{
		//base case
		if(n == 1){
			return 1;
		}
		//recursive case
		return n * multiplyLess(n - 1);
	}
	
	/**
	 * Calculate the n'th Lucas number.
	 * @param n the number of the Lucas number
	 * @return L(n) = L(n-2) + L(n-1)
	 */
	public static int lucas(final int n)
	{
		// you've seen fib! similar code
		switch (n)
		{
          // Base cases
			case 0: 
				return 2;
				
			case 1:
				return 1;
				
			//if the number is not 0 or 1 calculate lucas num
			default: 
				return lucas(n -1)+ lucas(n-2);
			
		}
	}
	
	/**
	 * Calculate the next Collatz number
	 * @param n the number to calculate from
	 * @return the next number in the Collatz sequence
	 */
	public static int nextCollatzNumber(int n)
	{
		//the num is even
		if (n%2==0)
		{
			//return the number divided by 2
			return n/2;
		}
		//the num is odd
		else
		{
			//the number is odd so return the next collatz num
			return (n * 3) + 1;
		} 
	}
	
	/**
	 * Calculate an entire Collatz sequence given a starting number
	 * @param n starting number
	 * @return list of Collatz numbers starting with n
	 */
	public static List<Integer> collatzList(int n)
	{
		if (n==1)
		{
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(1);
			return list; 
		}
		else
		{
			LinkedList<Integer> list = new LinkedList<Integer>();
			//1) add the current n to list
			list.add(n);
			
			//2) recursive call w/ next Collatz num
			//involves call to helper method
			//also involves calling itself(the rec. part)
			//BUT it also involves adding to the list
			n = nextCollatzNumber(n);
			list.addAll(collatzList(n));
			
			return list;
		}
	}
	
	/**
	 * Calculate the end balance given a starting balance, and interest rate
	 * (given as a decimal) and the number of times interest is added.
	 * 
	 * @param startBalance for the first period
	 * @param interestRate how much interest the money accrues 
	 * @param periods how many periods the money is invested (how many times interest is added)
	 * @return ending balance how much is returned at the end of the last period
	 */
	public static double calculateEndBalance(final double startBalance,
			final double interestRate, final int periods)
	{
		if (periods == 0)
		{
			//no change to balance
			return startBalance;
		}
		else
		{
			
			// Calculate the end balance for the first n-1 periods
			// The start balance for the n'th period is the end balance for the first n-1 periods
			double startBalanceForNthPeriod = calculateEndBalance(startBalance * (1 + interestRate),
																	interestRate, periods -1);
			// Then calculate the end balance for the n'th period by adding interest for one period.
			return startBalanceForNthPeriod;
		}
	}

	/**
	 * Calculate the ending population
	 * 
	 * @param startPopulation the starting population
	 * @param maxPopulation the maximum population that the environment will sustain
	 * @param growthRate starting growth rate, 0 < growthRate < 1
	 * @param periods that the population lives
	 * @return the ending population
	 */
	public static int calculateEndPopulation(final int startPopulation,
			final int maxPopulation, final double growthRate, final int periods)
	{
		//base case
		if(periods == 0) {
			
			return startPopulation;
		}
		//recursive case
		else{
			//calculate the newPopulation
			double newPopulation = (startPopulation + growthRate * (1 - (double)startPopulation/ maxPopulation)* startPopulation);
			
			//recursively calculate the growth of the population until it reaches base case
			return calculateEndPopulation((int)newPopulation, maxPopulation,growthRate,periods -1 );
		}
		
	}

}
