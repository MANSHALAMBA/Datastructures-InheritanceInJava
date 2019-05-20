package stack;

import java.util.*;

public class stack {
	
	public static void main() {
		
		          Stack<Integer> stack= new Stack<Integer>();
		          
		          stack.push(18);
		          stack.push(21);
		          stack.push(1000000);
		          
		          int a = stack.pop();
		          
		          System.out.println(a);
		          
		          System.out.print(stack.peek());
		          
		          int position =stack.search(18);
		          
		          
		          System.out.print(position);
		
	}

}
