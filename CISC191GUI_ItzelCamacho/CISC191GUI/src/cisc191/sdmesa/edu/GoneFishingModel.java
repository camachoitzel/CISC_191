package cisc191.sdmesa.edu;

/**
 * Lead Author(s):Itzel Camacho
 * @author Tasha Frankie
 * @author Allan Schougaard
 * 
 * Responsibilities of class:Sets the behavior of what happens when you click a button
 * 
 * Model and track the non-visual game play
 */

import java.util.Random;


public class GoneFishingModel
{
	public static int DIMENSION = 6;
	private boolean[][] grid = new boolean[DIMENSION][DIMENSION];
	private int triesRemaining = 30;
	private int fishRemaining = 10;

	/**
	 * TODO
	 */
	public GoneFishingModel()
	{
		Random randomNumberGenerator = new Random();
		for (int fishCounter = 0; fishCounter < fishRemaining; fishCounter++)
		{
			int row, column;
			do
			{
				row = randomNumberGenerator.nextInt(DIMENSION);
				column = randomNumberGenerator.nextInt(DIMENSION);
			} while (grid[row][column]);
			grid[row][column] = true;
		}
	}

	/**
	 * TODO
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean fishAt(int row, int column)
	{
		boolean foundFish = grid[row][column];
		triesRemaining--;
		if (foundFish)
		{
			fishRemaining--;
		}
		return foundFish;
	}

	/**
	 * TODO
	 * @return
	 */
	public int getTriesRemaining()
	{
		return triesRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public int getFishRemaining()
	{
		return fishRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean fishWin()
	{
		return triesRemaining == 0 && fishRemaining > 0;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean playerWins()
	{
		return fishRemaining == 0;
	}
}
