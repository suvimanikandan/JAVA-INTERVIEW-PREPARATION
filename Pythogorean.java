package Assignments4;

public class Pythogorean {
    // A Java program that returns true if there is a Pythagorean
// Triplet in a given array.


	// Returns true if there is Pythagorean triplet in ar[0..n-1]
	static boolean isTriplet(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					// Calculate square of array elements
					int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];

					if (x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}

		// If we reach here, no triplet found
		return false;
	}

	// Driver program to test above function
	public static void main(String[] args)
	{
		int arr[] = { 3, 1, 4, 6, 5 };
		int arr_size = arr.length;
		if (isTriplet(arr, arr_size) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}


    

