public class Palindrome {

	public static void main(String[] args) {

		int ipNum = 151;
		int temp = ipNum;
		int r, sum = 0;

		while (ipNum > 0) {
			r = ipNum % 10;   					
			sum = (sum * 10) + r;				 
			ipNum = ipNum / 10;					
		}
		if(sum == temp ) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not plaindrome");
		}

	}

}