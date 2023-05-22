//Jessica Sy
//September 22, 2022
//
public class Quadratic {
	//print out all the information
	public static String quadrDescriber(double num1, double num2, double num3){
		int a = (int)num1;
		int b = (int)num2;
		int c = (int)num3;
		String output = "Description of the graph of :\ny = " + num1 + " x^2 + " + num2 + 
				" x + " +num3 + "\n";
		if (num1 < 0) {
			output += "\nOpens: Down";
		} else {
			output += "\nOpens: Up";
		}
		
		output += "\nAxis of Symmetry: " + lineOfSymmetry(a,b,c);
		output += "\nVertex: " + vertex(a,b,c);
		output += "\nx-intercept(s): " + xInts(a,b,c);
		output += "\ny-intercept: " + num3;
				
				return output;

		
	}
	//finds the discriminants of the quadratic equation
	public static double discriminant (double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	//finds the absolute value 
	public static double absValue(double num) {
		if (num >= 0) {
			return num;
		} else {
			return 0 - num;
		}
	}
	//finds the maximum 
	public static double max(double num1, double num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	//finds the rounded number 
	public static double round2(double a) {
		double decimal;
		decimal = Math.round(a * 100.0) / 100.0;
		return decimal;
	}
	//finds the square 
	public static double sqrt(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Inappropriate value: argument cannot be negative");
			}
		double answer = Math.sqrt(a);
		double finalAnswer = Math.round(answer * 100.0) / 100.0;
		return finalAnswer;
	}
	//finds the quadratic form of the equation
	public static String quadForm(double a, double b, double c) {
		double root;
		double root1;
		double root2;
		if(Quadratic.discriminant(a, b, c) < 0) {
			return "no real roots";	
		}
		else if (Quadratic.discriminant(a,b,c) == 0) {
			root = -(b) / 2 * (a);
			return Quadratic.round2(root) + "";
		}
		else {
		root1 = (-(b) + Quadratic.sqrt(Quadratic.discriminant(a, b, c))) / (2*a);
		root2 = (-(b) - Quadratic.sqrt(Quadratic.discriminant(a, b, c))) / (2*a);
			
		}
		if (root1 > root2) {
			return Quadratic.round2(root2) + " and " + Quadratic.round2(root1);			
		}
		else {
			return Quadratic.round2(root1) + " and " + Quadratic.round2(root2);
		}
	}
	//finds the axis of symmetry
	public static double lineOfSymmetry(int a, int b, int c) {
		double x = (-b) / (2.0 * a);
		return x;
	}
	//finds the vertex
	public static String vertex(int a, int b, int c) {
		double x = lineOfSymmetry(a,b,c);
		double y = a * (x*x) + b * x + c;
		String vertexPoint = "(" + x + ", " + y + ") ";
		return vertexPoint;
	}
	//finds the x-intercept
	public static String xInts(int a, int b, int c) {
		String xIntercepts = quadForm(a,b,c);
		if(xIntercepts.equals("no real roots")) {
			xIntercepts = "none";
		}
		return xIntercepts;
	}
	
	
}
