/**
 * 
 */

/**
 * @author Akib
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 10;
		System.out.println("Printing Fibonicci series...");
		int start = 0, n2 = start + 1, n3;
		System.out.print(start + " " + n2);
		for (int i = 0; i < count - 2; i++) {
			n3 = start + n2;
			System.out.print(" " + n3);
			start = n2;
			n2 = n3;
		}

	}

}
