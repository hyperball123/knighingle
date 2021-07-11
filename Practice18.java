package knightingle;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		// 18. Area of a Square
		
		System.out.println("Enter Side of Square:");
		 Scanner scanner = new Scanner(System.in); 
		
		double side = scanner.nextDouble();
		double area = side*side;
		 System.out.println("Area of Square is: "+area);

	}

}
