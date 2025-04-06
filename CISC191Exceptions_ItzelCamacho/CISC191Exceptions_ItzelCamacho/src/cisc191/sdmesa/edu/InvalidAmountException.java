package cisc191.sdmesa.edu;
/**
 * Lead Author(s):Itzel Camacho 
 * @author 
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 4/4/2024
 * 
 * Responsibilities of class: Creates a custom exception to handle an
 * 							  invalid amount exception
 * 
 */
/**
 */

public class InvalidAmountException extends Exception {
	
	//create fields
	//InvalidAmountExceptions has-a amount
	private double amount;
	
	//create constructor
	public InvalidAmountException(double amount) {
		
		this.amount = amount;
	}
	
	//create a custom message
	public String getMessage(){
		
		return "Negative amount: $" + this.amount + " is not allowed";
	}

}
