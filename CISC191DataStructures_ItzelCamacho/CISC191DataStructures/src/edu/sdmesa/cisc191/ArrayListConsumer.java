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
 * Responsibilities of class: Use an ArrayList of Strings and remove an item from
 * 							  the list.
 * 
 */
import java.util.ArrayList;

public class ArrayListConsumer
{
	//an ArrayListConsumer has a list
	private ArrayList<String> list;


	//constructor for ArrayListConsumer
	public ArrayListConsumer(ArrayList<String> list) 
	
	{
		//initializes list variable attribute
		this.list = list;
		
	}


	/**
	 * 
	 * Purpose: Removes item at index 0 of ArrayList
	 * 
	 * @return: The value at index 0
	 */
	public String consume()
	{
		//check if list is empty
		if(list.isEmpty()) 
		{
			//return null if empty
			return null;
		}
		
		//remove item @index 0
		return this.list.remove(0);
	}

}
