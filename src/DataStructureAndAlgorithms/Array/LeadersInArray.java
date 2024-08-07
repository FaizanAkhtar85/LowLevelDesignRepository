package DataStructureAndAlgorithms.Array;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = arr.length;
		//leaders(arr,n);
		// efficient solution
		leadersEfficient(arr,n);
	}

	private static void leadersEfficient(int[] arr, int n) {
		int curr_leader = arr[n-1];
		System.out.print(curr_leader+" ");
		for(int i=n-2;i>=0;i--) {
			if(curr_leader < arr[i]) {
				curr_leader = arr[i];
				System.out.print(curr_leader+" ");
			}
		}
	}

	private static void leaders(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=i+1;j<n;j++) {
				if(arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
