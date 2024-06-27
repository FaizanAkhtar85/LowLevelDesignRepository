package DataStructureAndAlgorithms.Array;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println("Naive approach");
		int arr[]= {1,2,2,3,1,1,3,1,1},n=arr.length;
		int naiveApproach = naiveApproach(arr,n);
		System.out.println(naiveApproach);
		System.out.println("Efficient apporoach");
		int efficientApproach = efficientApproach(arr,n);
		System.out.println(efficientApproach);
	}

	private static int efficientApproach(int[] arr, int n) {
		int res=0;
		int count=1;
		for(int i=1;i<n;i++) {
			if(arr[res] == arr[i])
				count++;
			else
				count--;
			if(count==0) {
				res=i;
				count=1;
			}	
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(arr[res]==arr[i])
				count++;
		}
		if(count<=n/2)
			return -1;
		else
			return res;
	}

	private static int naiveApproach(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count >n/2)
				return i;
		}
		return -1;
	}

}
