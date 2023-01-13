import java.util.Scanner;

/* Student Name: Yalin Su
 * Lab Professor: Gustavo Adami
 * Due Date: July 29, 2022
 * Modified: July 29, 2022
 * Description: this program will allow client use as a measurement tool for quality control 
 * 				for the products that produced from the factory by entering the bag sizes and weight,
 * 				this program will provide 2 different options for size and
 * 				it will shows user the report of how many good bags and bad bags entered,
 * 				and the program will repeat the process until user discontinue the program.
 * 
 */

/*
 * this class contains the main method that it's used for running the Assignment02
 */
public class Assignment02 {

	/* this is the entry point for the program, tests for PotatoChipBag and User are define here
	 * asks user for input, sets the input into object's bag and user's field
	 * use isBagCorrectWeight() from class PotatoChipBag to determine whether the bag is good bag or bad bag
	 */
	public static void main(String[] args) {
		PotatoChipBag bag = new PotatoChipBag();
		User user = new User();
		Scanner input = new Scanner(System.in);
		// (other variables as needed)
		int goodBag = 0;
		int badBag = 0;
		int totalBag = 0;
		String userInput ="";
		boolean continueOption = false;
		int sizeRegular = 1;
		int sizeLarge = 2;
		int size = 0;
		double weight = 0.0;
		
		
		do {
			System.out.println("Enter bag size: ");
			System.out.printf("%d for regular size%n", bag.REGULAR);
			System.out.printf("%d for large size%n", bag.LARGE);
			size = user.inputInteger();
			bag.setSize(size);
			
			if (size != sizeRegular && size != sizeLarge) {
				System.out.println("invalid bag size entered");
				
			}
			else{				
				System.out.println("Enter weight: ");
				weight = user.inputDouble();
				bag.setWeight(weight);
			
				if (bag.isBagCorrectWeight()) {
					goodBag = goodBag+1;
					totalBag = goodBag + badBag;
					System.out.print("Good bags: "+goodBag+"\nBad bags: "+badBag+"\nTotal bags: "+totalBag);
				}
				else {
					badBag = badBag+1;
					totalBag = goodBag+badBag;
					System.out.print("Good bags: "+goodBag+"\nBad bags: "+badBag+"\nTotal bags: "+totalBag);
				}	
			}
			

			System.out.println("\nProgram by Yalin Su");
			System.out.println("Continue Program? (yes/no)");
			userInput = input.nextLine();
			
			if(userInput.equalsIgnoreCase("yes")) {
				continueOption = true;
				}
			else if(userInput.equalsIgnoreCase("no")){
				continueOption = false;
				System.out.println("Program has shut down");
			}
			
		}while(continueOption);
		
	}
}