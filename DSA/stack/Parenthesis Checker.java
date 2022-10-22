
https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/0


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
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
