package cisc191.sdmesa.edu;
/**
 * Lead Author(s): Itzel Camacho
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
 * Responsibilities of class: Work with a Binary Search tree to use recursion to 
 * 							populate 
 * 
 */
public class NameNode
{
	//A NameNode has-a left node
	
	private NameNode left;
	
	
	// A NameNode has-a name
	private String name;
	
	//A NameNode has-a right node
	
	private NameNode right;
	

	/**
	 * 
	 * @param newName the String stored in the node
	 */
	public NameNode(String newName)
	{
		//sets the starting value for name
		this.name = newName;
		
	}
	
	/**
	 * 
	 * @return the String stored in the node
	 */
	public String getName()
	{
		//returns name
		return this.name;
	}
	
	/**
	 * Set the left node of this node
	 * @param newLeft
	 */
	public void setLeft(NameNode newLeft)
	{
		//set left node
		this.left = newLeft;
		
	}
	
	/**
	 * Set the right node of this node
	 * @param newRight
	 */
	public void setRight(NameNode newRight)
	{
		//set right node
		this.right = newRight;
		
	}
	
	/**
	 * 
	 * @return the left node of this node
	 */
	public NameNode getLeft()
	{
		//get the left node
		return this.left;
	}
	
	/**
	 * 
	 * @return the right node of this node
	 */
	public NameNode getRight()
	{
		//get right node
		return this.right;
	}
	
	/**
	 * Find the least name in the tree
	 * @return the first name of the names in the tree in lexicographical order
	 */
	public String getFirstName()
	{
		//base case = no left child
		//already at the least name in the tree
		if(left == null) {
			
			return this.name;
		}
		//recursive case
		else {
			//pass the work to the left child
			return left.getFirstName();
		}
	}
	
	/**
	 * Find the largest name in the tree
	 * @return the last name of the names in the tree in lexicographical order
	 */
	public String getLastName()
	{
		//base case
		if(right == null) {
			//no right child means nothing is Bigger
			return this.name;
		}
		//recursive case
		else {
			//pass the work to the right child
			return right.getLastName();
		}
		
	}

	/**
	 * Insert a new name into a tree
	 * 
	 * @param newName the name to be inserted
	 */
	public void insert(String newName)
	{
		// See
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)

		if (newName.compareTo(name) < 0)
		{
			//insert newName on the left
			//does this node already not have a left node
			if(this.left == null) {
				this.left = new NameNode(newName); //create a NameNode object with the newName value
			}
			else {
				
				//pass on the work to the left node because it exists
				//it will then perform the same work of checking if it needs
				//to pass the work of adding the node or add it as its left node
				left.insert(newName);
			}
			
		}
		else if (newName.compareTo(name) > 0)
		{
			//need to add the name to the right of this node
			//does this node already have a right
			if(this.right == null) {
				this.right = new NameNode(newName);
			}
			else {
				//pass on the work to the right node
				right.insert(newName);
			}
		}

	}

	/**
	 * @return the names in the tree in lexicographical order
	 */
	public String toString()
	{
		String returnValue = "";
		
		

		// in-order traverse tree recursively:
		// traverse and add left subtree, then add this, then traverse and add right subtree
		// Warning: Minds have been blown during the implementation of this method...
		
		//traverse the left subtree
		if(left != null) {
			
			returnValue += left.toString();
		}
		
		//add the current node's name
		returnValue += name + "";
		
		//traverse the right subtree
		if(right != null) {
			
			returnValue += right.toString();
		}
		
		
		
		return returnValue;
	}

}
