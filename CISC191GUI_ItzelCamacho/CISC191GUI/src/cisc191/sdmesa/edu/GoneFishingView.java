package cisc191.sdmesa.edu;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

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
 * Responsibilities of class: Creates GUI for fishing game
 * 
 */
//GoneFishingView IS-A JFrame
public class GoneFishingView extends JFrame
{
	//declare the sliders as instance variables of h=the view
	//allows updating in the updateUI method
	private JSlider tries = new JSlider(JSlider.VERTICAL,0, 30, 30);
	private JSlider fish = new JSlider(JSlider.VERTICAL, 0, 10, 10);
	private GoneFishingModel model;
	private JLabel instructions;
	
	/**
	 * Constructor
	 * @param model
	 */
	public GoneFishingView(GoneFishingModel model)
	{
		//initialize constructor vars
		this.model = model;
		this.setTitle("Gone Fishing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		
		//instructions panel
		JPanel instructionsPanel = new JPanel();			//1)create panel
		instructions = new JLabel("Click a button to fish");//2)create widget
		instructionsPanel.add(instructions);				//3)add widget to panel
		this.add(instructions, BorderLayout.WEST);			//4)add the panel to the Frame

		//fishing panel - the grid of buttons
		JPanel fishingPanel = new JPanel();							// 1) create panel
		FishingButton[][] fishButtons = new FishingButton[6][6]; 	//2) 2D arr of buttons
		fishingPanel.setLayout(new GridLayout(6,6));				// set layout manager
		
		
		
		//loop for creating the 6x6 grid of buttons
		for(int row = 0; row < fishButtons.length; row++) 
		{
			for(int col = 0; col < fishButtons[0].length; col++) 
			{
				//Create a FishingButton @ location row, col
				FishingButton fish = new FishingButton(row,col);
				//fish button needs to have an actionlistener assigned for click events
				fish.addActionListener(new FishingButtonListener(model, this, fish));
				fishingPanel.add(fish); // add widget to panel
			}
		}
		
		//add fishingPanel to Jframe - add it to the center
		this.add(fishingPanel, BorderLayout.CENTER);
		
		
		/**
		 * East side - Sliders
		 */
		JPanel sliderPanel = new JPanel();	//create panel
		sliderPanel.setLayout(new GridLayout(1,6));
//		JSlider slider1 = new JSlider(JSlider.VERTICAL, 0, 30, 30); //create widget 1
//		JSlider slider2 = new JSlider(JSlider.VERTICAL, 0, 10, 10);	//create widget 2
//		JLabel slider1Label = new JLabel("Tries");
//		JLabel slider2Label = new JLabel("Fish");
		
		//set spacing for ticks on slider
		tries.setMajorTickSpacing(10);
		fish.setMajorTickSpacing(5);
		
		//draws the ticks and labels
		tries.setPaintTicks(true);
		tries.setPaintLabels(true);
		fish.setPaintTicks(true);
		fish.setPaintLabels(true);
		
		//disable the sliders
		tries.setEnabled(false);
		fish.setEnabled(false);

		
		//add widgets to panel
		sliderPanel.add(tries);
//		sliderPanel.add(slider1Label);
		sliderPanel.add(fish);
//		sliderPanel.add(slider2Label);
		
		//different way of adding a label to a JSlider
		tries.setBorder(BorderFactory.createTitledBorder("Tries"));
		fish.setBorder(BorderFactory.createTitledBorder("Fish"));
		

		//add slider panel to window
		this.add(sliderPanel, BorderLayout.EAST);
		
		//South side Label
		JPanel credit = new JPanel();							//create a panel
		credit.add((new JLabel("Coded by: Itzel Camacho")));	//add the label
		this.add(credit, BorderLayout.SOUTH);					//add panel to window
		
		pack();
		setVisible(true);
	}

	/**
	 * Main method
	 * 
	 */
	public static void main(String[] args)
	{
		//create a GoneFishing window
		new GoneFishingView(new GoneFishingModel());
	}
	
	public static void slider() {
		
		
	}

	/**
	 * Purpose: updates the value of tries and fish left in game
	 */
	public void updateUI()
	{
		//updates the sliders after a button is pressed
		tries.setValue(model.getTriesRemaining());
		fish.setValue(model.getFishRemaining());
	}
}
