/* Student Name: Yalin Su
 * Lab Professor: Gustavo Adami
 * Due Date: July 29, 2022
 * Modified: July 29, 2022
 * Description: this is a class is built that contains worker method 
 * to determine if the potato chip bag is good or bad, and used for 
 * support the run time of Assignment02
 * 
 */
/* Class PotatoChipBag represents properties and behaviors of the potato chip bag
 * it contains attributes of size, weight, and set values of bag size regular and large
 * and set value of weights for regular size and large size, and a epsilon value
 * that used as a standard for measurement
 * Also contains worker method to determine if the potato chip bag is good or bad
 */
public class PotatoChipBag {
	private int size; // Regular or Large (use constants below)
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz
	// TODO: declare an EPSILON constant with value 0.01
	public static final double EPSILON = 0.01;
	
	/*
	 * default constructor with no argument
	 */
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}
	
	/*
	 * overloaded constructor with argument
	 */
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}
	
	/*
	 * getter for size
	 */
	public int getSize() {
		return size;
	}
	
	/*
	 * setter for size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/*
	 * getter for weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/*
	 * setter for weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/*
	 * worker method to determine if the potato chip bag is good or bad
	 */
	public boolean isBagCorrectWeight() {
		boolean result = false; 
		
		if (size == REGULAR && Math.abs(weight - REGULAR_WEIGHT)<= EPSILON || size == LARGE&&Math.abs(weight - LARGE_WEIGHT )<= EPSILON) {
			result = true;
		}
		else {
			result = false;
		}
		
		
		return result;
	}
	
}