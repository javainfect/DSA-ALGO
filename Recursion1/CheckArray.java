package Recursion1;

public class CheckArray {

	
	public static boolean checkSorted(int [] arr) {
		
		
		if(arr.length <=1 ) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		
		int [] smallInput = new int [arr.length - 1];
		for(int i = 1; i<arr.length; i++) {
			smallInput[i-1]= arr[i];
		}		
	    
	
		return checkSorted(smallInput);
		
	}
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,6,8,9};
		System.out.println(checkSorted(arr));

	}

}

