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
 * Responsibilities of class: Creates a program that mimics a bank account
 * 
 */
/**
 */
public class BankAccount
{
	// A bank account has a current balance starting at $0.00
	private double balance = 0;

	/**
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Purpose: Deposit amount into account
	 * 
	 * @param amount to deposit
	 * @throws InvalidAmountException is thrown if amount is not positive
	 */
	public void deposit(double amount) throws InvalidAmountException
	{
		//checks if the amount is valid
		if(amount < 0) {
			//throw an error
			throw new InvalidAmountException(amount);
		}
		//the amount is valid and is added to account
		else {
			this.balance += amount;
		}
	}

	/**
	 * Purpose: Withdraw amount from account
	 * 
	 * @param amount to withdraw
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 * @throws InsufficientFundsException is thrown if there is not enough funds in
	 *                                    the account to make the withdrawal
	 */
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException
	{
		//checks that amount that is withdrawn is valid
		if(amount < 0) {
			
			throw new InvalidAmountException(amount);
		}
		//check that amount withdrawn is less than the balance
		else if(amount > this.balance) {
			//you're broke
			throw new InsufficientFundsException(amount, (int)this.balance);
		}
		//you have enough money and can withdraw
		else {
			
			this.balance -= amount;
		}
		
		
		
		
		
	}

	/**
	 * Withdraw amount requested or the biggest amount possible
	 * 
	 * @return the amount actually withdrawn
	 * @throws InsufficientFundsException 
	 * @throws InvalidAmountException 
	 */
	public double getAsMuchAsPossible(double requestAmount) throws InvalidAmountException, InsufficientFundsException
	{
		
		// Try to withdraw the requested amount
		
		if(requestAmount <= this.balance) {
			
			withdraw(requestAmount);
			return requestAmount;
			
		}
		
		// If it fails, get as much as possible
		else {
			
			//stores a copy of the balance
			double withdrew = this.balance;
			withdraw(balance);
			return withdrew;
		}

	}

}
