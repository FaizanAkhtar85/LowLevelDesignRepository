package DataStructureAndAlgorithms.Array;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		System.out.println("naive approach");
		int arr[]={1, -2, 3, -1, 2}, n=arr.length;
		int maxSumSubArray = maxSumSubArray(arr,n);
		System.out.println(maxSumSubArray);
		System.out.println("Efficient approach");
		int maxSumSubArrayEfficient = maxSumSubArrayEfficient(arr,n);
		System.out.println(maxSumSubArrayEfficient);
	}

	private static int maxSumSubArrayEfficient(int[] arr, int n) {
		int res =arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res=Math.max(maxEnding, res);
		}
		return res;
	}

	private static int maxSumSubArray(int[] arr, int n) {
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr+=arr[j];
				res=Math.max(res, curr);
			}
		}
		return res;
	}
}
