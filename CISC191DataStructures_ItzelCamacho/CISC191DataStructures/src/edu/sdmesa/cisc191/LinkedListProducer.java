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
 * Responsibilities of class: Adds an item to a linked list
 * 
 */
import java.util.LinkedList;

public class LinkedListProducer
{
	// A LinkedListProducer has-a list
	private LinkedList<String> list;

	//constructor for LinkedListProducer
	public LinkedListProducer(LinkedList<String> list)
	{
		//initializes list variable
		this.list = list;
	}

	/**
	 * 
	 * Purpose: add a new item to the LinkedList
	 * 
	 */
	public void produce(String string)
	{
		//add to the LinkedList
		list.add(string);
		
	}

}
