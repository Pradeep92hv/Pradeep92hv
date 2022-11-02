
https://practice.geeksforgeeks.org/problems/rod-cutting0840/1


class Solution{
    static int solve(int a[], int n,int i,int dp[][])
    {
        if(i==0)
        {
            return n*a[0];
        }
        if(dp[i][n]!=-1)  return dp[i][n];
        int take=Integer.MIN_VALUE;
        if(n>=i+1)                           // rodlength=i+1
        take=a[i]+solve(a,n-(i+1),i,dp);
        int not=solve(a,n,i-1,dp);
        
        return dp[i][n]= Math.max(take,not);
    }
    public int cutRod(int price[], int n) {
        //code here
        
        int dp[][]=new int[price.length][n+1];
        
        for(int x[]:dp)
        Arrays.fill(x,-1);
        return solve(price,n,n-1,dp);
    }
}
