/**
 * You are given an array of non-negative 
 * integers that represents a two-dimensional 
 * elevation map where each element is unit-width 
 * wall and the integer is the height. Suppose it 
 * will rain and all spots between two walls get filled up.

Compute how many units of water remain
 trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold
 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 
units in the first index, 2 in the second,
 and 3 in the fourth index 
 (we cannot hold 5 since it would run off to the left),
  so we can trap 8 units of water.

 * @author Rushvik
 *
 */


public class trapWater_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 0, 1, 3, 0, 5};
		System.out.println(trap(arr));
	}
	
	 public static void fill_arrays(int[] arr,int[] left,int[] right,int n){
	        
	        left[0] = arr[0];
	        for(int i=1;i<n;i++){
	            left[i]=Math.max(left[i-1],arr[i]);
	        }
	        right[n-1]= arr[n-1];
	        for(int i=n-2;i>=0;i--){
	            right[i]=Math.max(right[i+1],arr[i]);
	        }
	        
	        
	        
	    }
	    public static int trap(int[] height) {
	        int n = height.length;
	        if(n==0) return 0;
	        int[] left = new int[n];
	        int[] right = new int[n];
	        
	        fill_arrays(height,left,right,n);
	        
	        int sum = 0;int x;
	        for(int i=1;i<n-1;i++){
	            
	             x = Math.min(left[i],right[i])- height[i];
	            if(x>=0) sum=sum+x;
	        }
	        
	        return sum;
	    }
	

}


