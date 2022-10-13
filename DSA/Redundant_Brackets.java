

                                          https://www.codingninjas.com/codestudio/problems/redundant-brackets_975473?leftPanelTab=0


import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
       Stack<Character> st=new Stack<Character>();
        int i=0;
        int f=1;
        for(i=0;i<s.length();i++)
        {
           
             char c=s.charAt(i);
            if(c==')')
            {
                 f=0;
                while(st.peek()!='(' && !st.isEmpty())
                {
                    char x=st.pop();
                    if(x=='+' || x=='-' || x=='*' || x=='/' )
                    {
                        f=1;
                       
                    }
                 
                }
                st.pop();
                if(f==0)
                        return true;
                
          }
            else
            {
                st.push(c);
            }
        }
        return false;
    }
}
