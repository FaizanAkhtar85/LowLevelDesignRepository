package DataStructureAndAlgorithms.Array;
public class SecondLargest {
	public static int largestElement(int[] arr, int n) {
		int largest =0;
		for(int i=1;i<n;i++) {
			if(arr[largest] < arr[i]) {
				largest = i;
			}
		}
		return largest;	
	}
	public static int secondLargestElement(int[] arr, int n) {

		int res=-1;
		int largest = 0;
		for(int i=1; i<n;i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}
			else if(arr[i] < arr[largest]) {
				if(res ==-1 || arr[i] >arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		/*
		 *  Naive solution
		 */	
		int arr[]= {10,2,19,27,100,27,63,120};
		int n = arr.length;
		int largestElementIndex = largestElement(arr,n);
		int res = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largestElementIndex]) {
				if(res==-1)
					res=i;
				else if(arr[i]>arr[res])
					res=i;
			}
		}
		System.out.println("Naive solution for second largest element is: "+arr[res]);

		/*
		 * Efficient Solution
		 */
		System.out.println("Effcient solution for Second largest element is: "+arr[secondLargestElement(arr, n)]);

	}
}
