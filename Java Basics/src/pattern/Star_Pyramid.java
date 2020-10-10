package pattern;

public class Star_Pyramid {

	private static int input;

	public static void main(String[] args) {
		input = 10;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input-i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=i;j++) { //Inner Loop For Column
				System.out.print("* "); // Print * of the Inner Loop
			}
			System.out.println(); // To move to new row
		}

	}

}
