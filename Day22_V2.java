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
		
		/**
		 * got output as  the , bedroom , is , clean
		 */
		
		boolean[] arr = new boolean[s.length()];
        List<String> list = new ArrayList<>();
             
	  if(getReconstruction(s,str,arr,list)) {
	  
	  Collections.reverse(list);
	 
	  for(String i : list) {
		  System.out.println(i);
	  }
		}else {
			System.out.println("null");
		}

	}

    public static boolean getReconstruction(String s, List<String> wordDict,boolean[] arr ,List<String> list) {    
        if (s.length() == 0) {
            return true;
            
        } else if (arr[s.length() - 1]) {
            return false;
        }
        
        for (String word : wordDict) {
            if (s.startsWith(word) 
                && getReconstruction(s.substring(word.length()), wordDict, arr,list)) {
                list.add(word);
                return true;
            }
        }
        
        arr[s.length() - 1] = true;
            
        return false;
    }

}
