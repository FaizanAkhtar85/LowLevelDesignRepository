package DataStructureAndAlgorithms.Array;

public class MaximumDifference {

	public static void main(String[] args) {
		int arr[]= {2, 3, 10, 6, 4, 8, 1}, n=arr.length;
		int maxDiff = maxDiff(arr,n);
		System.out.println("Maximum Difference is "+maxDiff);
		int maxDiffEfficient = maxDiffEfficient(arr,n);
		System.out.println("Maximum Difference is "+maxDiffEfficient);
	}

	private static int maxDiffEfficient(int[] arr, int n) {
		int res = arr[1]-arr[0], minVal=arr[0];
		for(int i=1;i<n;i++) {
			res = Math.max(res, arr[i]-minVal);
			minVal = Math.min(minVal, arr[i]);
		}
		return res;
	}

	private static int maxDiff(int[] arr, int n) {
		int res= arr[1]-arr[0];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				res= Math.max(res, arr[j]-arr[i]);
			}
		}
		return res;
	}

}
