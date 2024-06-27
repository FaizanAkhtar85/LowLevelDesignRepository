package DataStructureAndAlgorithms.Array;

public class ReverseArray {

	public static void reverseArray(int[] arr, int n) {
		int low=0,high=n-1;
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		reverseArray(arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
