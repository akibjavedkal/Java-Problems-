package Arrays;

public class CopyArray {

	public static void main(String[] args) {

		// initialize Arrays
		int arr1[] = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		// Copy Array1 into Array 2
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Display Array2
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
