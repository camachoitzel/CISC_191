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
 * Responsibilities of class: Add an item to an ArrayList
 * 
 */
import java.util.ArrayList;

public class ArrayListProducer
{
	//An ArrayListProducer has-a list
	private ArrayList<String> list;

	//constructor for ArrayListProducer
	public ArrayListProducer(ArrayList<String> list) 
	{
		//initializes list variable attribute
		this.list = list;
	}
	
	/**
	 * 
	 * Purpose: 
	 * 
	 * @param i
	 * @param string
	 */
	public void produce(int i, String string)
	{
		//add a string to the array list
		this.list.add(i,string);
		
	}

}
