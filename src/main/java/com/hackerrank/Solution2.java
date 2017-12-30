package com.hackerrank;
import java.util.Stack;

public class Solution2 {
    
       public static boolean isBalanced(String expression) {
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < expression.length(); i++) {
            
            Character c = expression.charAt(i);
            
            if(c.equals('(') || c.equals('{') | c.equals('[')) {
                stack.push(c);
            } else {
            
                if(stack.isEmpty()) {
                    return false;
                }
                
                if(c.equals(')')) {
                    if(! stack.pop().equals('(')) {
                        return false;
                    }
                } else if(c.equals('}')) {
                    if(! stack.pop().equals('{')) {
                        return false;
                    }
                } else if(c.equals(']')) {
                    if(! stack.pop().equals('[')) {
                        return false;
                    }
                }
                
            }
            
        }

        if(stack.isEmpty()) {
        	return true;
        }
        
        return false;       
        
    }
  
    public static void main(String[] args) {
        int t = 1; 
        for (int a0 = 0; a0 < t; a0++) {
            String expression = "[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}](({[{[{)]{)}}}({[)}}([{{]]({{";
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}