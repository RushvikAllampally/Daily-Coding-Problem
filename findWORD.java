package dailyCodingPractice;
/*
 * Given a 2D matrix of characters and a
 *  target word, write a function that returns 
 *  whether the word can be found in the matrix
 *   by going left-to-right, or up-to-down.

For example, given the following matrix:

[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]
and the target word 'FOAM', you should return true,
 since it's the leftmost column. Similarly, given 
 the target word 'MASS', you should return true, 
 since it's the last row.
 */
public class findWORD {

	public static void main(String[] args) {
		
		char[][] arr = new char[][] {{'F', 'A', 'C', 'I'},
									{'O', 'B', 'Q', 'P'},
									{'A', 'N', 'O', 'B'},
									{'M', 'A', 'S', 'S'}};
				String s = "MASS";				
		System.out.println(findMatch(arr,s));
	}
	
	public static boolean findMatch(char[][] arr,String s) {
		
		return findincol(arr,s) || findinrow(arr,s) ;
	}

	private static boolean findinrow(char[][] arr,String s) {
		int j=0;
		int row=0;	
		while(row < arr.length) {
		for(int i=0;i<arr[0].length;i++) {
			if((s.charAt(j) == arr[row][i]) && (j <= s.length()-1)) {
				j++;
				if(j == s.length() ) {
					return true;
				}
			}else {
					j=0;
			}
		}
		row++;
		j=0;
		}
		return false;
	}

	private static boolean findincol(char[][] arr,String s) {
		int j=0;
		int row=0;	
		while(row < arr[0].length) {
		for(int i=0;i<arr.length;i++) {
			if((s.charAt(j) == arr[i][row]) && (j <= s.length()-1 )) {
				j++;
				if(j == s.length()-1) {
					
					return true;
				}
			}else {
				
					j=0;
				
			}
		}
		row++;
		j=0;
		}
		return false;
	}

}
