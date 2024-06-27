package DataStructureAndAlgorithms.Array;

public class WaterTrap {

	public static void main(String[] args) {
		int arr[] = {3, 0, 1, 2, 5}, n = arr.length;
		int waterTrapNaive = waterTrapNaive(arr,n);
		System.out.println("Naive solution for Water trap in unit is: "+waterTrapNaive);
		int waterTrapEfficient = waterTrapEfficient(arr,n);
		System.out.println("Efficient solution for Water trap in unit is: "+waterTrapEfficient);
	}

	private static int waterTrapEfficient(int[] arr, int n) {
		int res = 0;
		int lmax[]=new int[n];
		int rmax[] = new int[n];
		lmax[0] = arr[0];
		rmax[n-1] = arr[n-1];
		for(int i=1;i<n;i++){
			lmax[i] =  Math.max(arr[i], lmax[i-1]);
		}
		for(int i=n-2;i>=0;i--){
			rmax[i]= Math.max(arr[i], rmax[i+1]);
		}
		for(int i=1;i<n-1;i++){
			res+=(Math.min(lmax[i], rmax[i])-arr[i]);
		}
		return res;
	}

	private static int waterTrapNaive(int[] arr, int n) {
		int res = 0;
		for(int i=1;i<n-1;i++) {
			int lmax = arr[i];
			for(int j=0;j<i;j++) {
				lmax= Math.max(lmax, arr[j]);
			}
			int rmax = arr[i];
			for(int j=i+1;j<n;j++) {
				rmax= Math.max(rmax, arr[j]);
			}
			res+=(Math.min(lmax, rmax)-arr[i]);
		}
		return res;
	}
}