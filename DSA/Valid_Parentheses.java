https://www.codingninjas.com/codestudio/problems/valid-parenthesis_795104


import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String x) {
         Stack<Character> s=new Stack<>();
    
    for(int i=0;i<x.length();i++)
    {
        char a=x.charAt(i);
        
       if(s.isEmpty())
       s.push(a);
       else if(s.peek()=='(' && a==')' || s.peek()=='[' && a==']' ||s.peek()=='{' && a=='}' )
          s.pop();
          else
          s.push(a);
    }
    if(s.isEmpty())
    return true;
    else
    return false;
     
    
    }
   
    }
