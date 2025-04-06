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
 * Responsibilities of class: consumes an item from a queue
 * 
 */

import java.util.Queue;

public class QueueConsumer
{

	//a QueueConsumer has-a queue
	private Queue<String> queue;
	
	//constructor for QueueConsumer class
	public QueueConsumer(Queue<String> queue) 
	{
		//initializes queue variable attribute
		this.queue = queue;
		
	}
	
	/**
	 * 
	 * Purpose: If queue is not empty then remove an item from 
	 *          the queue
	 * 
	 * @return the removed item from the queue
	 */
	public String consume()
	{
		//check if queue is empty
		if(queue.isEmpty()) 
		{
			//return null if it is empty
			return null;
			
		}
		//return removed item
		return this.queue.remove();
	}

}
