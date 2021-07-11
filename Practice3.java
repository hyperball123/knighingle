package knightingle;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 3. Multiply Two Numbers. 
           
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of i....");
 
		int i=scan.nextInt();
		
		System.out.println("Enter value for j....");
		
		int j =scan.nextInt();
		
		int mul = i * j;
		 
		System.out.println("The multipliction of i & j is...." +mul);
	}

}
