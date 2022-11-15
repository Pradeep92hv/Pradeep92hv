https://www.codingninjas.com/codestudio/problems/selling-stock_630282?leftPanelTab=1

import java.util.*;
public class Solution {
    
    public static long getMaximumProfit (int n, long[] Arr) {
        long dp[][]=new long[n+1][2];
    for(long row[]: dp)
    Arrays.fill(row,-1);
    
    //base condition
    dp[n][0] = dp[n][1] = 0;
    
    long profit=0;
    
    for(int ind= n-1; ind>=0; ind--){
        for(int buy=0; buy<=1; buy++){
            if(buy==0){// We can buy the stock
                profit = Math.max(0+dp[ind+1][0], -Arr[ind] + dp[ind+1][1]);
            }
    
            if(buy==1){// We can sell the stock
                profit = Math.max(0+dp[ind+1][1], Arr[ind] + dp[ind+1][0]);
            }
            
            dp[ind][buy]  = profit;
        }
    }
    return dp[0][0];
      
    }
}




import java.util.*;
public class Solution {
    static long solve(long a[],int i,int b,long dp[][])
    {
        if(i==a.length)
             return 0;
     
        if(dp[i][b]!=-1) return dp[i][b];
        long profit=0;
        if(b==1)
           profit=Math.max(-a[i]+solve(a,i+1,0,dp),solve(a,i+1,1,dp));
        else
        {
         profit=Math.max(a[i]+solve(a,i+1,1,dp),solve(a,i+1,0,dp));
        }
        return  dp[i][b]=profit;
    }
    public static long getMaximumProfit (int n, long[] values) {
        
        long dp[][]=new long[n][2];
        
        for(long x[]:dp)
            Arrays.fill(x,(long)-1);
       return solve(values,0,1,dp);
    }
}
