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
 * Responsibilities of class: Simulate a checkout bill including tip 
 * 
 */
/**
 */
public class CheckoutBill
{
	// A bill has an amount
	private double amount = 0;
	// A bill has a tip percent
	private double tipPercent = -1;

	/**
	 * Set the amount from which to calculate the total bill
	 * 
	 * @param billAmount amount on the bill
	 * @throws IllegalArgumentException is thrown if amount is not positive
	 */
	public void setBillAmount(double billAmount) throws IllegalArgumentException
	{
		//check for illegal arguments
		if(billAmount <= 0) {
			
			//throw an exception
			throw new IllegalArgumentException();
		}
		else{
			
			//amount is good
			this.amount = billAmount;
		}
		
		
		
	}

	/**
	 * Set the tip percent from which to calculate the total bill
	 * 
	 * @param percent tip given
	 * @throws IllegalArgumentException is thrown if percent is negative
	 */
	public void setTipPercent(double percent) throws IllegalArgumentException
	{
		//check for invalid tip
		if(percent < 0) {
			
			throw new IllegalArgumentException();
		}
		else {
			//the tip % is good
			this.tipPercent = percent;
		}
	}

	/**
	 * Calculate the total bill from the bill amount and tip percentage
	 * @return total bill amount
	 * @throws IllegalStateException if bill amount is not positive or tip percent is negative
	 */
	public double calculateTotalBill() throws IllegalStateException
	{
		//check that the tip is correct
		if((this.tipPercent < 0) || (this.amount <= 0)) {
			
			throw new IllegalStateException();
		}
		//return the total bill
		return amount * (1 + tipPercent / 100);
	}

	//main method
	public static void main(String[] args) 
	{
		//prevent the program from crashing from (almost) any exception
		try {
		CheckoutBill bill = new CheckoutBill();
		bill.setTipPercent(-1); 
		bill.calculateTotalBill();
		}
		//Print out any error messages to user
		catch(IllegalArgumentException a){
			
			System.out.println(a + "bad argument");
		}
		catch(IllegalStateException b) {
			
			System.out.println(b + "bill has a bad state! check tip or bill amount");
		}
		catch(Exception e) {
			
			System.out.println(e + "the catch all exception");
		}
		
		finally {
			
			System.out.println(e + "This will run despite the exceptions");
		}
		
		
	}

}
