package DataStructureAndAlgorithms.Array;

public class StockBuyAndSell {
	public static void main(String[] args) {
		int arr[]= {1, 5, 3, 8, 12}, start =0, n=arr.length;
		int maxProfitNaive = maxProfitNaive(arr,start,n-1);
		System.out.println("Max profit earned by Naive solution is: "+maxProfitNaive);
		int maxProfitEfficeint = maxProfitEfficeint(arr,start,n-1);
		System.out.println("Max profit earned by efficient solution is: "+maxProfitEfficeint);
	}

	private static int maxProfitEfficeint(int[] arr, int start, int end) {
		int profit=0;
		for(int i=start+1;i<=end;i++) {
			if(arr[i] > arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}	
		return profit;
	}

	private static int maxProfitNaive(int[] arr, int start, int end) {
		if(end <= start) {
			return 0;
		}

		int profit =0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(arr[j]>arr[i]) {
					int curr_profit =arr[j]-arr[i]
							+maxProfitNaive(arr, start, i-1)
							+maxProfitNaive(arr, j+1, end);
					profit =Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}
}
