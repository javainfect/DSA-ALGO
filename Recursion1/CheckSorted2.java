package Recursion1;

public class CheckSorted2 {

	
	public static boolean checkSorted (int [] arr, int startindex) {
		
		if (startindex == arr.length -1) {
			return true;
		}
		if(arr[startindex] > arr[startindex +1]) {
			return false;
		}
		return checkSorted(arr , startindex+1 );
		
	}
	
	public static boolean checkSorted (int [] arr) {
		
		return checkSorted(arr , 0);
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,8,9,11,41};
		System.out.println(checkSorted(arr));

	}
}