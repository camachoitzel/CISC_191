package edu.sdmesa.cisc191;
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
 * Version/date: 1
 * 
 * Responsibilities of class: Consumes item from Stack
 * 
 */
import java.util.Stack;

public class StackConsumer
{
	//a StackConsumer has-a stack
	private Stack<String> stack;


	//constructor for StackConsumer class
	public StackConsumer(Stack<String> stack) 
	{
		//initializes stack variable attribute
		this.stack = stack;
	}

	/**
	 * 
	 * Purpose: removes the last element in the stack
	 * 
	 * @return the last element in the stack
	 */
	public String consume()
	{
		//check if the stack is empty
		if(stack.isEmpty())
		{
			//return null if empty
			return null;
			
		}
		//return last element of stack
		return stack.pop();
	}

}
