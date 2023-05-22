/* Jessica Sy
 * August 25, 2022
 * Library of Math Methods
 */
 public class Calculate{
	//returns the square of the input 
	public static int square(int number) {
		int answer = number * number;
		return answer;	
	}
	//returns the cube of the input 
	public static int cube(int number) {
		int answer = number * number*number;
		return answer;	
	}
	//returns the average of two inputs 
	public static double average(double number1, double number2) {
		double answer = (number1 + number2) / 2.0;
		return answer;	
	}
	//returns the average of three inputs 
	public static double average(double number1, double number2, double number3) {
		double answer = (number1 + number2 + number3) / 3.0;
		return answer;	
	}
	//returns degrees of an angle measure given in radians  
	public static double toDegrees(double radian) {
		double degrees = radian * (180/3.14159);
		return degrees;	
	}
	//returns radian of an angle measure given in degrees
	public static double toRadians(double degrees) {
		double radians = degrees * (3.14159/180);
		return radians;	
	}
	//returns the discriminant given coefficients of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		double discriminant = (b*b) - (4*a*c);
		return discriminant;	
	}
	//returns an improper fraction converted from the given a mixed number 
	public static String toImproperFrac(int num1, int num2, int num3) {
		String improperFraction = ((num1 * num3) + num2) + "/" + num3;
		return improperFraction;
	}
	//returns a mixed number converted from the given improper fraction
	public static String toMixedNum(int num1, int num2) {
		int wholeNumber = num1 / num2;
		int remainder = num1 % num2;
		String mixedNumber = wholeNumber + "_" + remainder + "/" + num2; 
		return mixedNumber;
	}
	//returns the quadratic equation given the binomial multiplication of the form
	public static String foil(int a, int b, int c, int d, String n) {
		String foil = (a*c)+ n + "^2 + " + ((a*d) + (b*c)) + n + " + " + (b*d);
		return foil;
	}
	//returns whether or not one input is divisible by the second input 
	public static boolean isDivisibleBy(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Inappropriate value: denominator argument cannot be zero");
			}
		boolean isDivisible = false;
		if (a % b == 0) {
			isDivisible = true;
		}
		return isDivisible;
	
	}
	//returns the absolute value of the input 
	public static double absValue(double a) {
		double absoluteValue;
		if (a >= 0) {
			absoluteValue = a;
		} else {		
			absoluteValue = a*(-1.0);
		}
		return absoluteValue;
	}
	//returns the larger of the two inputs 
	public static double max(double num1, double num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	//returns the largest of the three inputs 
	public static double max(double num1, double num2, double num3) {
		if (num1 >= num2) {
			if (num1 >= num3) {
				return num1;
			} else {
				return num3;
			}
		}
		else if (num2 >= num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	//returns the smaller of the two inputs 
	public static int min(int a, int b) {
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
	//returns the input rounded to two decimal points 
	public static double round2(double a) {
		double decimal;
		decimal = Math.round(a * 100.0) / 100.0;
		return decimal;
	}
	//returns the value of a value raised to a positive integer 
	public static double exponent(double a, int b) {
		if (a == 0) {
			throw new IllegalArgumentException("Inappropriate value: base argument cannot be zero");
			}
		if (b < 0) {
			throw new IllegalArgumentException("Inappropriate value: exponent argument cannot be negative");
			}
		if (b == 0) {
			return 1.0;
		}
		double answer = 1;
		for (int i = 1; i <= b;i++) {
			answer = a * answer;
		}
		return answer;
	}
	//returns the factorial of the input 
	public static int factorial(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("Inappropriate value: arugument cannot be negative");
			}
		int factorial = 1;
		for (int i=1; i <= a; ++i){
		factorial = factorial * i;
		}
		
		return factorial;
	}
	//returns whether or not the integer inputed is prime 
	public static boolean isPrime(int a) {
		boolean isPrime = true;
		for (int i = a /2; i > 1; i --) {
			if (isPrime == true) {
				boolean remainder = isDivisibleBy(a, i);
				if (remainder == true) {
					isPrime = false;
					i = 0;
				}
			}
		}
		return isPrime;
	}
	//returns the greatest common factor of two integer inputs 
	public static int gcf(int int1, int int2) {	
		int factor =1; 
		int int3 = (int) absValue((double) int1);
		int int4 = (int) absValue((double) int2);
		int number1;
		int number2;
		if (int3 >= int4) {
			number1 = int3;
			number2 = int4;
		} else {
			number1 = int4;
			number2 = int3;
		}
		for (int i = number1; i != 1; i --) {
			if(isDivisibleBy(number1, i) == true) {
				if(isDivisibleBy(number2, i) == true) {
					return i;
				}
			}
			
		}		
		return factor;	
	}
	//returns the square root of the input 
	public static double sqrt(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Inappropriate value: argument cannot be negative");
			}
		double answer = Math.sqrt(a);
		double finalAnswer = Math.round(answer * 100.0) / 100.0;
		return finalAnswer;
	}
	//returns the roots of a quadratic equation in standard form 
	public static String quadForm(int a, int b, int c) {
		double root;
		double root1;
		double root2;
		if(Calculate.discriminant(a, b, c) < 0) {
			return "no real roots";	
		}
		else if (Calculate.discriminant(a,b,c) == 0) {
			root = -(b) / 2 * (a);
			return Calculate.round2(root) + "";
		}
		else {
		root1 = (-(b) + Calculate.sqrt(Calculate.discriminant(a, b, c))) / (2*a);
		root2 = (-(b) - Calculate.sqrt(Calculate.discriminant(a, b, c))) / (2*a);
			
		}
		if (root1 > root2) {
			return Calculate.round2(root2) + " and " + Calculate.round2(root1);			
		}
		else {
			return Calculate.round2(root1) + " and " + Calculate.round2(root2);
		}
	}
	
	
	
	
}
