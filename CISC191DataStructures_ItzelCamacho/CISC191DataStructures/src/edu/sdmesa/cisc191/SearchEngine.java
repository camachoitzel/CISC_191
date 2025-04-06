package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

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
 * Responsibilities of class: Create an object that simulates a internet search engine
 * 
 */

public class SearchEngine {
	
	//a SearchEngine has-a search 
	private Hashtable<String, ArrayList<String>> search;
	
	//default constructor
	public SearchEngine() 
	{
		//initialize instance variable
		this.search = new Hashtable<String, ArrayList<String>>();
		
	}


	/**
	 * Purpose: Setter for search engine
	 * @param keyword the search keyword
	 * @param website, the website you want to attach to the keyword
	 */
	public void add(String keyword, String website) 
	{
		//check of the keyword exists
		//so you can retrieve the existing ArrayList
		if(search.containsKey(keyword)) 
		{
			//get the ArrayList
			ArrayList<String> links = search.get(keyword);
			
			//add to the ArrayList
			links.add(website);
			
		}
		
		//if DNE create the ArrayList and add it to the Hashtable
		else 
		{
			//1) Create an ArrayList that can store Strings
			//Should be a declaration AND instantiation
			
			ArrayList<String> list = new ArrayList<String>();
			
			//2) add the website to this list
			list.add(website);
			
			//3) add to the Hashtable
			search.put(keyword, list);
		}
		
	}

	/**
	 * 
	 * Purpose: Return hits for given keyword
	 * 
	 * @param keyword, the search keyword
	 * @return the list of websites
	 */
	public List search(String keyword) 
	{
		
		//if there is no hit for the keyword return an empty list
		if(!search.containsKey(keyword)) 
		{
			//create new ArrayList
			ArrayList<String> list = new ArrayList<String>();
			
			//return empty list
			return list;
			
			//or return( new ArrayList<String>());
		}
		//somehow make a copy of the search result
		//so they CANNOT access the data structure in our hashtable
		else
		{
			//get the ArrayList
			ArrayList<String> result = this.search.get(keyword);
			
			//Create a new list(as a copy)
			ArrayList<String> copy = new ArrayList<String>();

			//add all elements from original list
			copy.addAll(result);
			
			//return copy of ArrayList
			return copy;
			
			
		}
		
				
	}


}
