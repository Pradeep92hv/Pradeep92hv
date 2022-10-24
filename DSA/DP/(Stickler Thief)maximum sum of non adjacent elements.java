
https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/0

class Solution
{
    
    static int solve(int []a, int n, int []dp)
    {
        if(n==0)return a[n];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=a[n]+solve(a,n-2,dp);
        int notpick=0+solve(a,n-1,dp);
        
        return dp[n]=Math.max(pick,notpick);
    }
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
}
