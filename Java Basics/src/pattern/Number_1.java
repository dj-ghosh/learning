package pattern;

public class Number_1 {

	private static int input,number;

	public static void main(String[] args) {
		input = 10;
		number = 1;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=i;j++) { // Inner Loop For Column
				System.out.print(number++ +" "); // Print of the * of the Inner Loop
			}
			System.out.println(); // To move to new row
			number =1;
		}

	}

}
