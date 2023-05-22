//Jessica Sy
//September 27, 2022
//allow the user to keep guessing a number within a range until they guess correct 
import java.util.*;

public class Guessing 
{
	public static void greetUser(String userName) {
		  System.out.println("Hello " + userName + "! ");
	}
	

	public static int getRandomNumber(int low, int high)
	{
		// Math.random() returns a decimal in the range [0, 1)
		// Pick a low and high value and test this out.  Can the 
		// computer choose the low and high bounds as its number?
		int rand = (int) (Math.random() * (high - low + 1)) + low;
		return rand;
	}
	
	public static String compareToSecret(int guessedNum, int secretNum)
	{
		String guessIs = "";
		if (guessedNum < secretNum)
			guessIs = "low";
		else
			guessIs = "high";
		return guessIs;
	}
	
	public static boolean inRange(int low, int high, int num)
	{
		
		if (low <= num && num <= high)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = scan.nextLine();
		greetUser(userName);
		System.out.println("Enter lower guessing range:");
		String low = scan.nextLine();
		int lowest = Integer.parseInt(low);
		System.out.println("Enter higher guessing range:");
		String high = scan.nextLine();
		int highest = Integer.parseInt(high);
		if (lowest > highest) {
			throw new IllegalArgumentException("Lower bound cannot be greater than the higher bound");
			}
		int secret = getRandomNumber(lowest, highest);
		System.out.println("Enter your guess:");
		int guess = scan.nextInt();
		if (guess < lowest|| guess > highest) {
		throw new IllegalArgumentException("Inappropriate value: guess is not within range");
		}
	
			while (secret != guess) {
			String lowHigh = compareToSecret(guess, secret); 
			System.out.println("Nope. " + guess + " is too " + lowHigh);
			System.out.println("Guess again!");
			guess = scan.nextInt();
			}
			if (secret == guess)
			{
				System.out.println("You guessed right!");
				System.out.println("My number was " + secret + "!");
		}
		
				
	}

}
