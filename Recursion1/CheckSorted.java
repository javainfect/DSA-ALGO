package Recursion1;

public class CheckSorted {
	
public static boolean checkSorted(int [] arr) {
		
		
		if(arr.length <=1 ) {
			return true;
		}
			
		
		int [] smallInput = new int [arr.length - 1];
		for(int i = 1; i<arr.length; i++) {
			smallInput[i-1]= arr[i];
		}		
	    
	
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(arr[0]<=arr[1]) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr = {1,3,5,6,8,4};
		System.out.println(checkSorted(arr));

	}

}
