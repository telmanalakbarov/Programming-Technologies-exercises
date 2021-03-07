import java.util.Scanner;	// program uses class Scanner


public class mesele2_28 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int r;	// user input for circle's radius
		
		System.out.print("Enter the radius of the circle: ");	// prompt
		r = input.nextInt();	// read radius input
		
		System.out.printf("Diameter of the circle is %d\n", (2 * r));	// calculates the diameter
		System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * r));	// calculates the circumference
		System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (r * r)));	// calculates the area

	} // end method main

} // end class 
