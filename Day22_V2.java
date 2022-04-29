import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day22_V2 {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		
		str.add("is");
		str.add("clean");
		str.add("the");
		str.add("bed");
		str.add("bedroom");
		
		String s = "thebedroomisclean" ;
		
		boolean[] arr = new boolean[s.length()];
        List<String> list = new ArrayList<>();
             
	  if(wordBreak(s,str,arr,list)) {
	  
	  Collections.reverse(list);
	 
	  for(String i : list) {
		  System.out.println(i);
	  }
		}else {
			System.out.println("null");
		}

	}

    public static boolean wordBreak(String s, List<String> wordDict,boolean[] arr ,List<String> list) {    
        if (s.length() == 0) {
            return true;
            
        } else if (arr[s.length() - 1]) {
            return false;
        }
        
        for (String word : wordDict) {
            if (s.startsWith(word) 
                && wordBreak(s.substring(word.length()), wordDict, arr,list)) {
                list.add(word);
                return true;
            }
        }
        
        arr[s.length() - 1] = true;
            
        return false;
    }

}
