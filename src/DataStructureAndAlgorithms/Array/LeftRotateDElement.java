package DataStructureAndAlgorithms.Array;

public class LeftRotateDElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int d=2;
		//Naive Solution
		//leftRotateDElementNaiveSol(arr,n,d);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Efficient Solution");
		//leftRotateDElementEfficientSol(arr,n,d);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reversal Method");
		leftRotateDElementReversalSol(arr,n,d);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void leftRotateDElementReversalSol(int[] arr, int n, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}

	private static void reverse(int[] arr, int low, int high) {

		while(low<high) {
			int temp = arr[low];
			arr[low]= arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

	private static void leftRotateDElementEfficientSol(int[] arr, int n, int d) {
		int temp[] = new int[d];
		for(int i=0;i<d;i++) {
			temp[i]= arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d] = arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i] = temp[i];
		}
	}

	private static void leftRotateDElementNaiveSol(int[] arr, int n, int d) {
		for(int i=0;i<d;i++) {
			leftRotateOne(arr,n);
		}
	}

	private static void leftRotateOne(int[] arr, int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1]=temp;		
	}
}
