package pattern;

public class Star_Sandglass {

	private static int input;

	public static void main(String[] args) {
		input = 7;
		for(int i=1;i<=input;i++) {  //Reverse Pyramid
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=input-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=input;i++) {  //Pyramid
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
