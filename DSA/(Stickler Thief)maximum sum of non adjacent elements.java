


https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1

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










tabulazation

static int solveUtil(int n, int[] arr, int[] dp){
    
    dp[0]= arr[0];
    
    for(int i=1 ;i<n; i++){
        int pick = arr[i];
        if(i>1)
            pick += dp[i-2];
        int nonPick = 0+ dp[i-1];
        
        dp[i]= Math.max(pick, nonPick);
    }
    
    
    return dp[n-1];
}

static int solve(int n, int[] arr){
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return solveUtil(n, arr, dp);
}



space optimized

static int solve(int n, int[] arr){
    
   int prev = arr[0];
    int prev2 =0;
    
    for(int i=1; i<n; i++){
        int pick = arr[i];
        if(i>1)
            pick += prev2;
        int nonPick = 0 + prev;
        
        int cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
}
