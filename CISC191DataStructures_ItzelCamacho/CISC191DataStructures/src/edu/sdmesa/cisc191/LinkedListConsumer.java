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
 * Responsibilities of class: Removes an item from a Linked List
 * 
 */
import java.util.LinkedList;

public class LinkedListConsumer
{
	// A LinkedListConsumer has-a list
	private LinkedList<String> list;

	//constructor for LinkedListConsumer class
	public LinkedListConsumer(LinkedList<String> list)
	{
		//initializes list variable
		this.list = list;
	}

	/**
	 * Purpose: removes first element in LinkedList
	 * 
	 * @return the 1st element
	 */
	public String consumeHead()
	{
		//check if list is empty
		if(list.isEmpty())
		{
			//if is empty return null
			return null;
		}
		
		//Remove first element of LinkedList
		return list.removeFirst();
	}
	
	/**
	 * Purpose: removes last element in LinkedList
	 * 
	 * @return the last element
	 */
	public String consumeTail()
	{
		//check if list is empty
		if(list.isEmpty())
		{
			//if is empty return null
			return null;
		}
		
		//remove last element in LinkedList
		return list.removeLast();
	}

}
