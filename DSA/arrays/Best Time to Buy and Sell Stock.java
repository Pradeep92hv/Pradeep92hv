https://www.codingninjas.com/codestudio/problems/stocks-are-profitable_893405?leftPanelTab=1

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> a){
        int min=a.get(0);
        int p=0;
        
        for(int i=1;i<a.size();i++)
        {
           
            min=Math.min(min,a.get(i));
            p=Math.max(p,a.get(i)-min);
       
        }
        return p;
    }
}
