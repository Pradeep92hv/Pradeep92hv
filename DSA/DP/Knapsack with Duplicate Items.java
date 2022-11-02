


https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1

class Solution{
    static int solve(int i,int w, int val[],int wt[],int dp[][])
    {
        if(i==0)
        {
            return (int)((w/wt[0])*val[0]);
        }
        if(dp[i][w]!=-1)   return dp[i][w];
        int take=Integer.MIN_VALUE;
        if(wt[i]<=w)
        take=val[i]+solve(i,w-wt[i],val,wt,dp);
        int not=solve(i-1,w,val,wt,dp);
        
        return dp[i][w]=Math.max(not,take);
    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int dp[][]=new int[N][W+1];
        
        for(int x[]:dp)
        Arrays.fill(x,-1);
        return solve(N-1,W,val,wt,dp);
    }
}
