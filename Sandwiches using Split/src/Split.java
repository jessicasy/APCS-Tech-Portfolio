/* Jessica Sy 
 * Code for SplitString that will print out the items in a sandwich
 * November 6, 2022
 */

public class Split {

        public static void main(String[] args) {

                System.out.println(getFilling("applespineapplesbreadmayohambreadcheese"));
                System.out.println(getFilling("breadmayobread"));
                System.out.println(getFilling("applesbreadmayobread"));
                System.out.println(getFilling("breadhambreadcheese"));
                System.out.println(getFilling("breadbread"));
                System.out.println(getFilling("breadcheese"));
                System.out.println(getFilling("hamcheesebread"));
                System.out.println(getFilling("cheese"));
                System.out.println(getFilling("breadcheesebreadhambread"));
                System.out.println(getFilling("hambreadmayobaconbreadavocadobread"));

                System.out.println(getFilling2("apples bread mayo bread"));
                System.out.println(getFilling2("bread ham bread cheese"));
                System.out.println(getFilling2("bread bread"));
                System.out.println(getFilling2("bread cheese"));
                System.out.println(getFilling2("ham bread mayo bacon bread avocado bread"));
                
            
                
            
        }
        public static String getSandwich (String sandwich, String split) {
        	int bread1 = sandwich.indexOf("bread");
        	int bread2 = sandwich.lastIndexOf("bread");
        	if (bread1 == -1 || bread2 == -1 || bread1 == bread2) {
        		return "Not a Sandwich";
        	}
        	sandwich = sandwich.substring(bread1 + 5, bread2);
        	String[] inside = sandwich.split(split);
        	String filling = "";
        	for (int i = 0; i < inside.length; i++) 
        		filling += inside[i];
        	return filling;
     
        }
        
        public static String getFilling (String sandwich) {
        	return getSandwich(sandwich, "bread");
        }
        public static String getFilling2 (String sandwich) {
        	return getSandwich(sandwich, " ");
        }
        
        
}

        
      



