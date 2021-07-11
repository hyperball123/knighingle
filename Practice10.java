package knightingle;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// 10. Check whether a given number is ODD or EVEN ?
		
		 Scanner reader = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int num = reader.nextInt();
		 if(num % 2 == 0)
		 System.out.println(num + " is even");
		 else
		 System.out.println(num + " is odd");
	}

}
