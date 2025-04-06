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
 * Version/date:1
 * 
 * Responsibilities of class: Adds an item to a queue
 * 
 */
import java.util.Queue;

public class QueueProducer
{

	//a QueueProducer has-a queue
	private Queue<String> queue;


	//constructor for QueueProducer class
	public QueueProducer(Queue<String> queue) 
	{
		//initializes the queue variable attribute
		this.queue = queue;
		
	}


	/**
	 * 
	 * Purpose: Adds an element to the end of the queue
	 * 
	 */
	public void produce(String string)
	{
		//add element to queue
		this.queue.add(string);
		
	}

}
