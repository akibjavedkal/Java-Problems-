
public class Armstrong {
	public static void main(String[] args) {

		int c = 0, temp, r;

		int n = 154;
		temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			c = c + (r * r * r);
		}

		if (c == temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}

	}
}
