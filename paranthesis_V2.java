
import java.util.HashMap;
import java.util.Map;

public class paranthesis_V2 {

	public static void main(String[] args) {
		
		String str = "({[]})";
		System.out.println(isValid(str));
		
	}
	

	
	 public static boolean isValid(String s) {
	       
		 Map<Character,Integer> map = new HashMap<>();
		 
		for (char c : s.toCharArray()) {
			if (c == '(')
				map.put(')', map.getOrDefault(')', 0)+1);
			    
			
			else if (c == '{')
				map.put('}', map.getOrDefault(')', 0)+1);
			
			else if (c == '[')
				map.put(']', map.getOrDefault(')', 0)+1);
			else {
				
				map.put(c, map.getOrDefault(')', 0)-1);
			    if (map.isEmpty() || map.get(c) < 0 ) {
				return false;
			    }
			
				
			}
		}
		for(char c : map.keySet()) {
			if(map.get(c) != 0) {
				return false;
			}
		}
			
			return true;
	    }


}
