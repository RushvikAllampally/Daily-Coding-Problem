/**
 * This problem was asked by Amazon.

Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive
 characters as a single count and character. 
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. 
You can assume the string to be encoded have no digits and consists 
solely of alphabetic characters.
 You can assume the string to be decoded is valid.
 
 * @author Rushvik
 *
 */
public class encodingString {

	public static void main(String[] args) {
		
		System.out.println(encoding(new String("AAAABBBCCDAA")));
				
	}
	
	public static String encoding(String str) {
		if(str == null) {
			return null;
		}
		char pre ;
		char curr = str.charAt(0);
		String st = "";
		int count=1;

		for(int i=1;i<str.length();i++) {
			
			pre = curr;
			curr = str.charAt(i);
			
			if(pre != curr) {
				
				
				st = st +  String.valueOf(count) + pre;
				
				count=0;
				
			}			
			count++;
			
		}		
		
		st = st + String.valueOf(count) + curr ;
		
		return st;
	}

}
