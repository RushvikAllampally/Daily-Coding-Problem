import java.util.*;

/**
 * 
 * This problem was asked by Microsoft.

Compute the running median of a sequence of numbers. 
That is, given a stream of numbers, print out the median of the list so far on each new element.

Recall that the median of an even-numbered list is the average of the two middle numbers.

For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:

2
1.5
2
3.5
2
2
2
 * @author Rushvik
 *
 */

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2, 1, 5, 7, 2, 0, 5};
		MedianFinder ans = new MedianFinder();
		
		for(int i=0;i<arr.length;i++) {
			ans.addNum(arr[i]);
			System.out.println(ans.findMedian());
		}
		
	}

}

class SortedList {
    List<Integer> list;
    
    SortedList() {
        list = new ArrayList<>();
    }
    
    public void insert(int num) {
        int n = list.size();
        if(n == 0) {
            list.add(num);
            return;
        }
        for(int i=0;i<n;i++) {
            if(num < list.get(i)) {
                list.add(i, num);
                return;
            }
        }
        list.add(n, num);
    }
}

class MedianFinder {
    SortedList sorted;
    
    public MedianFinder() {
        sorted = new SortedList();
    }
    
    public void addNum(int num) {
        sorted.insert(num);
    }
    
    public double findMedian() {
        int n = sorted.list.size();
        if(n % 2 == 0) {
            return (sorted.list.get(n/2) + sorted.list.get((n/2) - 1)) / (double)2.0;
        } else {
            return (double)sorted.list.get(n/2);
        }
    }
}
