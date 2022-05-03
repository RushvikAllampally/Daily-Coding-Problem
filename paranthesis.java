import java.util.ArrayDeque;

public class paranthesis {

	public static void main(String[] args) {
		
		String str = "({[]})";
		System.out.println(isValid(str));

	}
	
	 public static boolean isValid(String s) {
	       
	        ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	        
	    }

}
