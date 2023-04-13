package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Map<String, Integer> Height = new HashMap<>();
		
		Height.put("Lesly", 20);
		Height.put("Luis", 69);
		Height.put("Aadit",64);
		
		
		Scanner in = new Scanner(System.in);
		String name = " "; 
		
		while (!name.equals("Quit")) {
			System.out.println("Enter Name");
			name = in.next();	
			if (Height.get(name)==null) {
					System.out.println("Invalid name. Try again.");	
				}
				else {
					Height.get(name);
					System.out.println(name + " ," + Height.get(name));	
					}
			}
		}
}
		

