https://practice.geeksforgeeks.org/problems/coin-change2448/1


class Solution {
      static long solve(int i,int k,int a[],long dp[][])
    {

        if(i==0)
        {
            if(k%a[i]==0) return 1;
            else
            return 0; 
            
        }
        if(dp[i][k]!=-1) return dp[i][k];
        long aa=solve(i-1,k,a,dp);
        long b=0;
        if(k>=a[i])
        b=solve(i,k-a[i],a,dp);
     //    System.out.println(aa+b);
        return dp[i][k]=(aa+b);
    }
    public long count(int coins[], int N, int V) {
        // code here.
        
         long dp[][]=new long[N][V+1];
         for(long x[]:dp)
         Arrays.fill(x,-1);
	    
	    return (long)solve(N-1,V,coins,dp);
    }
}
