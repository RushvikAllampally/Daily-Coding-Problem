/**
 * This problem was asked by Google.

Given an array of strictly the characters 'R', 'G', and 'B', 
segregate the values of the array so that all the Rs come 
first, the Gs come second, and the Bs come last. 
You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], 
it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
 */

package dailyCodingPractice;

public class Day35 {

	public static void main(String[] args) {
		char[] arr = new char[] {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		
		partition(arr);
		
		for(char i : arr ) {
			System.out.println(i);
		}
		
	}
	
	public static char[] partition(char [] arr) {
		  
		  int low=0;
		  int mid =0;
		  int high = arr.length-1;
		  
		  while(mid<=high) {
		   if(arr[mid] == 'R') {
		    char temp = arr[mid];
		    arr[mid] = arr[low];
		    arr[low] = temp;
		    low++;
		    mid++;
		   
		   }
		   else if(arr[mid] == 'G') {
		    mid++;
		   }
		   else {
		    char temp = arr[high];
		    arr[high] = arr[mid];
		    arr[mid] = temp;
		    high--;
		   }
		  }
		  return arr;

		 }

}
