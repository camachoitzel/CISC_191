package cisc191.sdmesa.edu;

import javax.swing.JButton;

/**
 * Lead Author(s): Itzel Camacho
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
 * Version/date: 1
 * 
 * Responsibilities of class: Create a button grid for the game
 * 
 */
//FishingButton IS-A JButton
public class FishingButton extends JButton
{
	//a FishingButton has-a row and col
	private int row, col;

	/**
	 * Constructor
	 * @param row of buttons
	 * @param column of buttons
	 */
	public FishingButton(int row, int column)
	{
		this.row = row;
		this.col = column;
		this.setText("?");
	}

	/**
	 * Purpose: Getter for amount of rows
	 * @return the rows
	 */
	public int getRow() 
	{
		return row;
	}

	/**
	 * Purpose: Getter for amount of columns
	 * @return the columns
	 */
	public int getColumn() 
	{
		return col;
	}

}
