package knightingle;

public class Practice9 {

	public static void main(String[] args) {
		// 9. Swap Two Numbers
		
			 float first = 2.50f, second = 4.50f;
			 System.out.println("--Before swap--");
			 System.out.println("First number = " + first);
			 System.out.println("Second number = " + second);
			
			float temporary = first;
			first = second;

			second = temporary;
			 System.out.println("--After swap--");
			 System.out.println("First number = " + first);
			 System.out.println("Second number = " + second); 

	}

}
