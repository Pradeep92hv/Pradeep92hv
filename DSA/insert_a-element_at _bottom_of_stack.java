https://www.codingninjas.com/codestudio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166?leftPanelTab=0


import java.util.* ;
import java.io.*; 
public class Solution 
{
    static void fun(Stack<Integer> s, int x)
    {
        int a=s.pop();
        if(!s.isEmpty())
        {
            fun(s,x);
        }
        if(s.isEmpty())
            s.push(x);
        s.push(a);
    }
  public static Stack<Integer> pushAtBottom(Stack <Integer> s, int x) 
  {
    // Write your code here
      fun(s,x);
          return s;
  }
}
