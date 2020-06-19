
public class Factorial {

	public static void main(String[] args) {

		double fact = 1;

		int count = 5;

		for (int i = 1; i <= count; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
