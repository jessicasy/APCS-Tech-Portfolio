/* Jessica Sy
 * August 25, 2022
 * Client code for testing the methods in the math library called Calculate 
 */

public class DoMath {

	public static void main(String[] args) throws IllegalAccessException  {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(-2));
		System.out.println(Calculate.average(5.5,6.4));
		System.out.println(Calculate.average(5.5,6.4, 7.8));
		System.out.println(Calculate.toDegrees(8));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(2, 8, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(3, 8, -5, 4, "n"));
		System.out.println(Calculate.isDivisibleBy(6,2));
		System.out.println(Calculate.absValue(-8));
		System.out.println(Calculate.max(5,5));
		System.out.println(Calculate.max(10,15,15));
		System.out.println(Calculate.min(10,7));
		System.out.println(Calculate.round2(-6.564));
		System.out.println(Calculate.exponent(3, 2));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(16));
		System.out.println(Calculate.gcf(0,100));
		System.out.println(Calculate.sqrt(71));
		System.out.println(Calculate.quadForm(1, -1, -6));

	
		
			
	}

}
