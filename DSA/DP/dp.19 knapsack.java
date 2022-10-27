

https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int solve(int i,int w, int []wt, int []val, int dp[][])
    {
//         if(i<0)
//         {                                 // this also crt
//             return 0;
//         }
        if(i==0)
        {
            if(wt[0]<=w) return val[0];
            else
            return 0;
        }
        if(dp[i][w]!=-1) return dp[i][w];
        int nottake=solve(i-1,w,wt,val,dp);
        int take=Integer.MIN_VALUE;
        if(w>=wt[i])
        take=val[i]+solve(i-1,w-wt[i],wt,val,dp);
        
        return dp[i][w]=Math.max(take,nottake);
    }
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][]=new int[n][w+1];
         for(int x[]:dp)
         Arrays.fill(x,-1);
         return solve(n-1,w,wt,val,dp);
    } 
}


