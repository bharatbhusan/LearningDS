package stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) 
	
	{
		
		String str = "{}[] {([])]}";
		System.out.println(isValidParanthesis(str));
	}
	
	/*
	 * Time Complexity - O(n)
	 * Space Complexity -O(1)
	 */
	public static boolean isValidParanthesis(String str)
	{
		
		if(str.length()%2!=0 || str.length()==0)
			return false;
		
		Stack<Character> st = new Stack<Character>();
		for(char ch:str.toCharArray())
		{
			if(ch=='{') st.push('}');
			else if(ch=='(') st.push(')');
			else if(ch=='[') st.push(']');
			else 
				{
				if(st.isEmpty() || st.pop()!=ch) return false;
				}
					
		}
		if(!st.isEmpty()) return false;
		
		return true;
	}
}
