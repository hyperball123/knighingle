package knightingle;

import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
		// 19. Area of Triangle
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the width of the Triangle:");
		 double base = scanner.nextDouble();
		 System.out.println("Enter the height of the Triangle:");
		 double height = scanner.nextDouble();
		 //Area = (width*height)/2
		double area = (base* height)/2;
		 System.out.println("Area of Triangle is: " + area);

	}

}
