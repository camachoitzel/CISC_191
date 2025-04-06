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
 * Responsibilities of class: Creates an object that simulates a phone directory
 * 
 */

import java.util.Hashtable;

public class PhoneDirectory {
	
	//a PhoneDirectory has-a directory
	private Hashtable<String, Integer> directory;
	
	//default constructor
	public PhoneDirectory() 
	{
		//initialize instance variable
		directory = new Hashtable<String, Integer>();
	}

	/**
	 * 
	 * Purpose: Adds an item to a hashtable
	 * 
	 */
	public void setNumberForPerson(String name, int number) 
	{
		//add to the hashtable
		this.directory.put(name, number);
		
	}

	/**
	 * 
	 * Purpose: Finds the number attached to the person key
	 * 
	 * @return the number associated with the name
	 * 
	 */
	public Integer findNumberForPerson(String name) 
	{
		//return the number
		return this.directory.get(name);
		
	}

	/**
	 * 
	 * Purpose: Deletes a key
	 * 
	 * 
	 */
	public void forget(String name) 
	{
		//deletes a key
		this.directory.remove(name);
	}
}
