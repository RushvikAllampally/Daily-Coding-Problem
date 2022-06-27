package dailyCodingPractice;
/*
 * Given an array of integers, write a function
 *  to determine whether the array could become 
 * non-decreasing by modifying at most 1 element.

For example, given the array [1, 5,4 ,8, 9], you should
 return true, since we can modify the 10 into a 1 to 
 make the array non-decreasing.

Given the array [10, 5, 1], you should return false,
 since we can't modify any one element to get a 
 non-decreasing array.
 */
public class Non_Decreasing {

	public static void main(String[] args) {
		
		int[] arr = new int[] {12, 9, 10, 5, 2};
		
		System.out.println(check(arr,arr.length));
		
	}
	
	 public static boolean check(int[] arr, int n)
	    {
	 
	       
	        int modify = 0;
	 
	       
	        if (arr[n - 1] >= arr[n - 2]) {
	            arr[n - 1] = arr[n - 2] - 1;
	            modify++;
	        }
	 
	        
	        if (arr[0] <= arr[1]) {
	            arr[0] = arr[1] + 1;
	            modify++;
	        }
	 
	        // Loop from 2nd element to the 2nd last element
	        for (int i = n - 2; i > 0; i--) {
	 
	           
	            if ((arr[i - 1] <= arr[i] && arr[i + 1] <= arr[i])
	                || (arr[i - 1] >= arr[i] && arr[i + 1] >= arr[i])) {
	 
	                arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
	                modify++;
	            }
	        }
	 
	        // If more than 1 modification is required
	        if (modify > 1)
	            return false;
	 
	        return true;
	    }
}
