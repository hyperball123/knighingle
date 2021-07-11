package knightingle;

public class Practice24 {

	public static void main(String[] args) {
		// 24. Program to Sum the elements of an Array 

			 int[] array = {10, 20, 30, 40, 50, 10};
			int sum = 0;
			//Advanced for loop
			for( int num : array) {
			 sum = sum+num;
			 }
			 System.out.println("Sum of array elements is:"+sum);
	}

}
