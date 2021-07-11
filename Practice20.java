package knightingle;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		// 20. Find Area of Circle 
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the radius: ");
		 
		 double radius = scanner.nextDouble();
		 
		double area = Math.PI * (radius * radius);
		 System.out.println("The area of circle is: " + area);

		 double circumference= Math.PI * 2*radius;
		 System.out.println( "The circumference of the circleis:"+circumference) ;

	}

}
