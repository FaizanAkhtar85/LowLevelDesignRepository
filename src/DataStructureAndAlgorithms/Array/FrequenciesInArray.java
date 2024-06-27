package DataStructureAndAlgorithms.Array;
public class FrequenciesInArray {

	public static void main(String[] args) {
		int arr[]= {12,10,10,4,5,6,92,92,92}, n= arr.length;
		frequenciesInSortedArray(arr,n);	
	}

	private static void frequenciesInSortedArray(int[] arr, int n) {
		int freq=1,i=1;
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			i++;
			freq=1;
		}
		if(n==1 || arr[n-1] != arr[n-2]) {
			System.out.println(arr[n-1]+" "+1);
		}
	}
}
