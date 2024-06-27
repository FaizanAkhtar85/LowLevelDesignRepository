package DataStructureAndAlgorithms.Array;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		System.out.println("Naive approach");
		int arr[]= {0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,0}, n=arr.length;
		int consecutiveOnesNaive = consecutiveOnesNaive(arr,n);
		System.out.println(consecutiveOnesNaive);
		System.out.println("Efficeint approach");
		int consecutiveOnesEfficient = consecutiveOnesEfficient(arr,n);
		System.out.println(consecutiveOnesEfficient);
	}

	private static int consecutiveOnesEfficient(int[] arr, int n) {
		int res=0,curr=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				curr=0;
			else {
				curr++;
				res=Math.max(curr, res);
			}
		}
		return res;
	}

	private static int consecutiveOnesNaive(int[] arr, int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i; j<n; j++) {
				if(arr[j]==1)
					curr++;
				else 
					break;
			}
			res=Math.max(res, curr);
		}
		return res;
	}
}
