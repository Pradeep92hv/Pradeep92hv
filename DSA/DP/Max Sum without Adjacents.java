https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/0



class Solution {
     static int solve(int []a, int n, int []dp)
    {
        if(n==0)return a[n];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=a[n]+solve(a,n-2,dp);
        int notpick=0+solve(a,n-1,dp);
        
        return dp[n]=Math.max(pick,notpick);
    }
    int findMaxSum(int arr[], int n) {
        // code here
                int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
}
