//Jessica Sy
//September 22, 2022
//Client code -- gets input from user which it send to the Quadratic for processing
//Print the results. Keeps asking for input until the user says quit.
import java.util.*;
public class QuadraticClient {
	
	public static void main(String[] args) {
		String quit = "";
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer ");
		System.out.println("Provides values for coefficients a, b, and c");
		while (!quit.equalsIgnoreCase("quit")) {
			System.out.println("a: ");
			double a = userInput.nextDouble();
			System.out.println("b: ");
			double b = userInput.nextDouble();
			System.out.println("c: ");
			double c = userInput.nextDouble();
			
			String output = Quadratic.quadrDescriber(a, b, c);
			
			System.out.println(output);
			
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			quit = userInput.next();
			
		}
		
	}
}
