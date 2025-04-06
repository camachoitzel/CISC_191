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
 * Responsibilities of class: Adds an item to a Stack
 * 
 */
import java.util.Stack;

public class StackProducer
{
	//a StackProducer has-a stack
	private Stack<String> stack;


	//constructor for StackProducer class
	public StackProducer(Stack<String> stack) 
	{
		//initializes stack variable attribute
		this.stack = stack;
		
	}


	/**
	 * 
	 * Purpose: add an element to the top of the stack
	 * 
	 */
	public void produce(String string)
	{
		//adds string to the top of the stack
		stack.push(string);
		
	}

}
