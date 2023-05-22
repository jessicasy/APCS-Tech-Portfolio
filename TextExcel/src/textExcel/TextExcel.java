package textExcel;
// Jessica Sy
// February 21, 2023
// Client Code

import java.util.Scanner;

//Update this file with your own code.

public class TextExcel
{
 
	public static void main(String[] args)
	{
	    // Add your command loop here
		/* scanner 
		 * generate spreadsheet
		 * print it out
		 * loop
		 * 		get a command
		 * 		process and do the command
		 * 		print results or updated spreadsheet
		 * 		exit after "quit"
		 */
	    System.out.println("Please enter your expression new");
      	Scanner userInput = new Scanner(System.in);
     	String thencontinue = userInput.nextLine();
	    Spreadsheet sheet= new Spreadsheet();
	      while(!thencontinue.equalsIgnoreCase("quit")) {
	    	  System.out.println(sheet.processCommand(thencontinue));
	    	  System.out.print("Enter a Command: ");
	    	  thencontinue =  userInput.nextLine();
	    	
	      }
	      userInput.close(); 
}
	} 
