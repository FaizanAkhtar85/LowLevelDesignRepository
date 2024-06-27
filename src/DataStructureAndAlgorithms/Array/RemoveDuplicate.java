package DataStructureAndAlgorithms.Array;

public class RemoveDuplicate {
	public static void main(String[] args) {

		int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
		n = removeDuplicate(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int removeDuplicate(int[] arr, int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[res-1] !=arr[i])
			{
				arr[res]=arr[i];
				res++;
			}

		}
		return res;

	}
}
