package edu.sdmesa.cisc191;

import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

/**
 * Lead Author(s):Itzel Camacho
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
 * Version/date:
 * 
 * Responsibilities of class: Checks if something is a palindrome
 * 
 */

public class Datastructure
{
	public static boolean isPalindrome(char[] letters)
	{
		
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		Stack stack = new Stack<String>();
		Queue queue = new LinkedList<String>();
		
		
		//add every character in letters to the stack and queues
		for(char el : letters) //for each el in letters
		{
			stack.push(el);
			queue.add(el);
		}
		
		//part 2: 
		//visit every element in both queue and stack
		//compare them each time -> if not equal then not a palindrome(return false)
		
		while(!stack.isEmpty()) 
		{
			//remove from both and check if not equal
			if(stack.pop() != queue.remove())
			{
				//if not equal return false
				return false;
			}
			
		
			
		}
		
		//return true if palindrome
		return true;
	}

}
