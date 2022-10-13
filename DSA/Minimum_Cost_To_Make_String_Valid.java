
https://www.codingninjas.com/codestudio/problems/minimum-cost-to-make-string-valid_1115770?leftPanelTab=0

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
		// Write your code here
        if(str.length()%2!=0)
            return -1;
        int o=0,cl=0;
      Stack<Character> s=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='}')
                cl++;
            else
                o++;
            if(s.isEmpty())
            {
                s.push(c);
                 
            }
            else{
                if(s.peek()=='{' && c=='}')
                {
                 s.pop();
                    o--;
                    cl--;
                    
                }
                else
                {
                 s.push(c);    
                }
             }
        }
        return (o+1)/2+(cl+1)/2;
    }
}
