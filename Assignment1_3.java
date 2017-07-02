package assignment1;
/*
 * This class will print the truth table for Logical AND and Bitwise AND operator 
 */
public class Assignment1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean a, b;
         a = false;
         System.out.println("a   	b     a && b   	a&b");// printing headers 
         do {
               b = false;
               do {
                     System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a & b)); //print
                     b = !b; 
               } while (b);//condition
               a = !a;
         } while (a);//condition
	}

}// class closed
