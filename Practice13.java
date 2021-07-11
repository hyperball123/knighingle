package knightingle;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// 13. While Loop Demonstration


		int number, sum = 0;
		 Scanner sc = new Scanner(System.in);

		 System.out.println("n Please Enter any integer Value below 10: ");
		 number = sc.nextInt();

		 while (number <= 10) {
		 sum = sum + number;
		 number++;
		 }
		 System.out.format(" Sum of the Numbers From the While Loop is: %d ",
		sum);
	}

}
