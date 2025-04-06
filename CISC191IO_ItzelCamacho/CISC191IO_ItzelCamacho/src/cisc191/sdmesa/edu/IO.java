package cisc191.sdmesa.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;
import java.util.*;

/**
* 
 * Lead Author(s): Itzel Camacho
 * @author This is great 1
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
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class IO
{
	/**
	 * Creates a file and appends the new line of data
	 * @param filename the file to be create
	 * @param newlineData the data to be appended
	 */
	public static void startTestResults(String filename, String newlineData) {
 
		FileWriter writer = null;
 
		try {
			//use FileWriter for writing to files
			//parameter is the file name
			writer = new FileWriter(filename); 
 
			//write any data to the writer
			writer.write(newlineData);
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
 
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
 
		}
 
 
 
	}
 
 
 
 
 
	public static String readTestResults(String filename){
		Scanner scanner = null;
		String result = "";
 
		try {
			 //Create a file object for the Scanner object
			 //case does not matter :)
			 File file = new File(filename); //careful of file name
 
			 //Create a scanner from the file
			 scanner = new Scanner(file);
			 
 
			 //iterate through the file while there are lines to read
			 while(scanner.hasNextLine()) {
 
				 //read the next line, scanner will move to the next one automatically
				 result += scanner.nextLine();
 
			 }
			 
			 scanner.close();
		}
			 
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
		
		finally {
			//close scanner if needed
			if(scanner!=null)
				scanner.close();
		}
 
 
		//return result
		System.out.println(result);
		return result;
 
	}
 
 
 
 
 
	public static void appendTestResult(String filename, String newData) {
		try {
		    // Open the file for appending
		    FileWriter writer = new FileWriter(filename, true);
 
		    // Write some data to the file
		    writer.write(newData + "\n"); //add a new line character after each line
 
		    // Close the writer
		    writer.close();
		} catch (IOException e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
 
	}
 
 
 
 
 
	public static String readDateTime(String url) {
 
		String result = "";
 
		URL urlObject;
		try {
			urlObject = new URL(url);
			Scanner scanner = new Scanner(urlObject.openStream());
			while (scanner.hasNextLine()) {
			    String line = scanner.nextLine();
 
			    // process the line by adding it to result
			    result += line;
			}
 
			scanner.close();
			}
		
		catch (Exception e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
 
 
		System.out.println(result);
 
		//remove everything before "202" because that's the 2024 start!
		result = result.substring(result.indexOf("202"));
		
 
		//now remove everything after the time zone portion
		result = result.split(":00")[0];
 
 
 
		//print to console just for our debugging
		System.out.println(result);
 
		return result + ":00";
 
 
 
	}
 
}
