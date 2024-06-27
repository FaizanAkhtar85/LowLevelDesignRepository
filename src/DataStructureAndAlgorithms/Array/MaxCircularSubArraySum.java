package DataStructureAndAlgorithms.Array;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {
		int arr[]={5, -2, 3, 4}, n=arr.length;
		System.out.println("Naive Approach");
		int naiveApproach = naiveApproach(arr,n);
		System.out.println(naiveApproach);
		System.out.println("Efficient approach");
		int efficientApproach = efficientApproach(arr,n);
		System.out.println(efficientApproach);
	}

	private static int efficientApproach(int[] arr, int n) {
		int max_normal = normalMaxSum(arr,n);
		if(max_normal<0)
			return max_normal;
		int arr_sum=0;
		for(int i=0;i<n;i++) {
			arr_sum+=arr[i];
			arr[i]=-arr[i];
		}
		int max_circular = arr_sum+normalMaxSum(arr, n);
		return Math.max(max_circular,max_normal);
	}

	private static int normalMaxSum(int[] arr, int n) {
		int res=arr[0],maxEnding=arr[0];
		for(int i=1;i<n;i++) {
			maxEnding=Math.max(maxEnding+arr[i], arr[i]);
			res=Math.max(maxEnding, res);
		}
		return res;
	}

	private static int naiveApproach(int[] arr, int n) {
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr_sum=arr[i];
			int curr_max=arr[i];
			for(int j=1;j<n;j++) {
				int index=(i+j)%n;
				curr_sum+=arr[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			res=Math.max(curr_max, res);
		}
		return res;
	}

}
