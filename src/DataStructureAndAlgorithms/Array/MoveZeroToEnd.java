package DataStructureAndAlgorithms.Array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int arr[]= {10,8,0,0,12,0};
		int n= arr.length;
		moveZeroToEnd(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void moveZeroToEnd(int[] arr, int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				swap(arr,i,count);
				count++;
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
