package DataStructureAndAlgorithms.Array;
public class IsSortedArray {

	static boolean isSorted(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isSortedEfficientSolution(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {5,15,25,26};
		System.out.println(isSorted(arr,arr.length));	// naive solution
		System.out.println(isSortedEfficientSolution(arr,arr.length));		//efficient solution
	}
}
