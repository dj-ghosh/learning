package pattern;

public class Number_19 {

	private static int input;
	private static int num;

	public static void main(String[] args) {
		input = 9;
		for(int i=1;i<=input;i++) {
			num = i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+input-j;
			}
			System.out.println();
		}

	}

}
