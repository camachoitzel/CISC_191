package cisc191.sdmesa.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
 * Version/date: 1
 * 
 * Responsibilities of class: Creates a listener for the FishButton object
 * 
 */

public class FishingButtonListener implements ActionListener
{
	//Has-a model
	private GoneFishingModel model;
	//Has-a view
	private GoneFishingView view;
	//Has-a button
	private FishingButton button;
	/**
	 * Constructor
	 * @param goneFishingModel the model
	 * @param goneFishingView the view
	 * @param fishingButton a button
	 */
	public FishingButtonListener(GoneFishingModel goneFishingModel, GoneFishingView goneFishingView,
			FishingButton fishingButton)
	{
		this.model = goneFishingModel;
		this.view = goneFishingView;
		this.button = fishingButton;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//user clicks a button
		//need to figure out if there's a fish at this location(where button is)
		//if there is, button needs to change text to "Fish" or "X" if they  missed
		if(model.fishAt(button.getRow(), button.getColumn())) 
		{
			//change the text to "Fish"
			button.setText("Fish");
			button.setEnabled(false);
		}
		else 
		{
			//change the text to "X"
			button.setText("X");
			button.setEnabled(false);

		}
		//update the UI after a fish or x is found
		this.view.updateUI();
		
	}
	

}
