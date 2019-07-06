import javax.swing.JOptionPane; //this part allows us to use the pop-up interface

public class RenovationProjectManager {
	
	int aExample;
	String bExample; 
	
	public RenovationProjectManager(int a, String b) {
		aExample = a;
		bExample = b;
		}
	
	public static void main(String[] args) {
		int selection; // selection is what the user inputs when they want to choose a particular
						// option. The program only accepts integer input.
		String tempInput; // tempInput and wallNames are both String variables which means they accept
							// both numbers and letters.
		String menu = "Menu:\n"; // same with menu, except now menu is assigned with "Menu: \n". "\n" means new
									// line so a new line will be printed after whatever is in the quotation marks.
		menu += "1. Calculate paint required for a wall\n"; // menu variable has now been assigned these two lines,
															// asking the user to choose between either option 1 or 2.
		menu += "2. Calculate paint required for project";
		 
		RenovationProjectManager myExample = new RenovationProjectManager (1, "This is an example of a constructor method");
		System.out.println(myExample.aExample + ". " +myExample.bExample);
		
		tempInput = JOptionPane.showInputDialog(menu); // tempInput is now assigned as whatever the user chooses.
														// Remember that tempInput was also assigned the String data
														// type.
		while (tempInput != null) { // a while loop which details particular outcomes depending on the user's input.
									// While the tempInput is not null, perform these actions.
			selection = Integer.parseInt(tempInput);// selection has now been parsed as an Integer, so we're looking for
													// a whole number input.
			if (selection == 1) { // if the selection exactly equals '1', run the following code
				selection1();
			} else if (selection == 2) { // otherwise, if the input exactly equals '2', run the following code:
				selection2();
			} else {// if the user enters something other than 1 or 2, return with "invalid choice".
					// This is a method of verification.
				JOptionPane.showMessageDialog(null, "Invalid choice!");
			}
			tempInput = JOptionPane.showInputDialog(menu);// run it again
		
		}
	}
	

	public static void selection1() {
		double wallArea = 0, cost, height, length, costPerSqm; // wallArea is declared as the data type double, which
		// means you are able to input decimal values
		String tempInput; // tempInput and wallNames are both String variables which means they accept
							// both numbers and letters.
		costPerSqm = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per sq.m ($)")); // this asks
		// for the
		// cost per
		// sq.m in a
		// dollar
		// value in
		// a pop-up
		// box
		tempInput = JOptionPane.showInputDialog("Enter a wall name"); // pop-up box asking user for wall name.
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter " + tempInput + " wall height (m)")); // pop-up
		// asking
		// user
		// for
		// wall
		// height,
		// with
		// the
		// previously
		// entered
		// wall
		// name
		// included.
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter " + tempInput + " wall length (m)")); // same as
																												// above
																												// but
																												// with
																												// wall
																												// length.
		wallArea = height * length; // math multiplying height and length to find the wallArea
		cost = wallArea * costPerSqm; // working out the cost by multiplying the wallArea and costPerSqm
		JOptionPane.showMessageDialog(null,
				"Cost to paint " + tempInput + " wall of " + wallArea + " sq.m. is $" + cost);// shows the results of
																								// the calculation with
																								// the user input
																								// values.
	}

	public static void selection2() {
		double wallArea = 0, cost, height, length, costPerSqm; // wallArea is declared as the data type double, which
		// means you are able to input decimal values
		String tempInput, wallNames; // tempInput and wallNames are both String variables which means they accept
		// both numbers and letters.
		String menu = "Menu:\n"; // same with menu, except now menu is assigned with "Menu: \n". "\n" means new
		// line so a new line will be printed after whatever is in the quotation marks.
		menu += "1. Calculate paint required for a wall\n"; // menu variable has now been assigned these two lines,
		// asking the user to choose between either option 1 or 2.
		menu += "2. Calculate paint required for project";
		tempInput = JOptionPane.showInputDialog(menu); // tempInput is now assigned as whatever the user chooses.
		// Remember that tempInput was also assigned the String data
		// type.
		costPerSqm = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per sq.m ($)")); // asks user to
		// enter a
		// cost per
		// sq.m
		wallNames = ""; // wallName is being initialised with ""
		wallArea = 0; // wallArea is initialised with the value of 0
		cost = 0; // cost is also initialised with the value of 0
		tempInput = JOptionPane.showInputDialog("Enter a wall name (cancel to finish)");
		while (tempInput != null) { // while the input isn't nothing, perform these actions. If someone presses
// cancel, move on to the next course of action.
			height = Double.parseDouble(JOptionPane.showInputDialog("Enter " + tempInput + " wall height (m)")); // asks
			// user
			// for
			// wall
			// height
			// with
			// previously
			// input
			// wallName
			length = Double.parseDouble(JOptionPane.showInputDialog("Enter " + tempInput + " wall length (m)")); // as
			// above
			// but
			// with
			// length.
			wallArea += height * length; // height and length values are multiplied
			wallNames += tempInput + ", ";// wallNames are now added to the tempInput value, ready to show the
// user the final output
			tempInput = JOptionPane.showInputDialog("Enter a wall name (cancel to finish)"); // shows option box
			// again, giving
			// the user the
			// option to
			// enter more
			// walls
		}
		cost = wallArea * costPerSqm;// after the user presses cancel, the cost is calculated by multiplying the
// wallArea(s) and the cost PerSqm values.
		JOptionPane.showMessageDialog(null,
				"Cost to paint " + wallNames + "wall(s) of " + wallArea + " sq.m. is $" + cost);// the whole
		// output is now
		// shown to the
		// user,
		// complete with
		// calculations
		// and names of
		// walls.
	}


//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. It can be used to set initial values for object attributes




}

