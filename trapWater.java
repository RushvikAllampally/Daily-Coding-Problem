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


public class trapWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 0, 1, 3, 0, 5};
		System.out.println(maxWaterTrapped(arr));
	}
	
	public static int maxWaterTrapped(int[] arr) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int water=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i] >= max) {
			   max=arr[i];
			   
		   }else if(arr[i] < max && arr[i] >= max2){
			   max2 = arr[i];
		   }
	   }
	   for(int i=0;i<arr.length;i++) {
		   
		   if(max2 < arr[i]) {
			   water = water + Math.abs(arr[i]-max2);
		   }
		   
	   }
	return water;
		
	}
	

}
