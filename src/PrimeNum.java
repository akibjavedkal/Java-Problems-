/**
 * 
 */

/**
 * @author Akib
 *
 */
public class PrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// checking if prime or not
		int num = 4;
		if (num % 2 == 0) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is prime");
		}

		// printing prime for given range from 1
		int count = 11;
		for (int i = 0; i <= count; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}

		}

	}

}
