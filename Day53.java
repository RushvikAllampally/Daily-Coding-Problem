package dailyCodingPractice;
/**
 * Implement a queue using two stacks. 
 * Recall that a queue is a FIFO (first-in, first-out)
 *  data structure with the 
 *  following methods: enqueue, 
 *  which inserts an element into the 
 *  queue, and dequeue, which removes it.
 * @author rushvikallampally
 *
 */
import java.util.*;
public class Day53 {

	public static void main(String[] args) {
		
		StackDeque<Integer> deque = new StackDeque<>();
		deque.push(3);
		deque.push(4);
		deque.push(5);
		deque.push(6);
		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
	


}

class StackDeque<T>{
	
	Stack<T> stack1;
	Stack<T> stack2;
	public StackDeque() {
		super();
		this.stack1 = new Stack();
		this.stack2 = new Stack();
	}
	
	public void push(T data) {
		
		stack1.push(data);
		
	}
	
	public T pop() {	
		while(!stack1.isEmpty()){
		stack2.push(stack1.pop());
		
		}
		T ans = stack2.pop();
		System.out.println("ans="+ans);
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
			
		}		
		return ans;
	}
		
	
}
