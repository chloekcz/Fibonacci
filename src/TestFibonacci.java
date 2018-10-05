import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1, val2, val3;
		val1 = 0;
		val2 = 1;
		val3 = val1 + val2;
		
		System.out.println("Choisissez un rang");
		
		Scanner questionUser = new Scanner(System.in);
		
		int a = questionUser.nextInt();
		
		System.out.println();
		
		questionUser.close();
		
		if (a > 0) {
			System.out.println(0);
		} if (a > 1) {
			System.out.println(1);
		} if (a > 2){
			System.out.println(1);
		}

		for (int i = 3; i < a; i++) {
			val1 = val2;
			val2 = val3;
			val3 = val1 + val2;
			System.out.println(val3);
		}
		
	}

}
