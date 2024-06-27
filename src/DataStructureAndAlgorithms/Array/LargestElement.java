package DataStructureAndAlgorithms.Array;

public class LargestElement {

	public static int largestElement(int[] arr, int n) {
		int largest =arr[0];
		for(int i=1;i<n;i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;	
	}

	public static void main(String[] args) {
		int arr[]= {1000,2,19,27,100,27,63,120};
		System.out.println(largestElement(arr,arr.length));

	}

}
