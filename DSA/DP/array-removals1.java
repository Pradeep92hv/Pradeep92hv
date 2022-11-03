https://practice.geeksforgeeks.org/problems/array-removals/1



class Solution {
    static int solve(int a[], int s, int l,int k,int dp[][])
    {
        if(Math.abs(a[s]-a[l])<=k) return 0;
        if(s==l) return (int)Math.pow(10,9);
        if(dp[s][l]!=-1) return dp[s][l];
        
        int x=(int)Math.pow(10,9),y=(int)Math.pow(10,9);
        
        if(Math.abs(a[s]-a[l])>k)
        x=1+solve(a,s+1,l,k,dp);
        y=1+solve(a,s,l-1,k,dp);
        
        return dp[s][l]= Math.min(x,y);
    }
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int dp[][]=new int[n][n];
        for(int x[]:dp)
        Arrays.fill(x,-1);
        return solve(arr,0,n-1,k,dp);
        
    }
}
