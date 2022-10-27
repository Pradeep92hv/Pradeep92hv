
https://practice.geeksforgeeks.org/problems/number-of-coins1824/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    static int solve(int i,int k,int a[],int dp[][])
    {
//         if(i<0)
//         {
//             if(k==0) return 0;
//             else
//             return(int)Math.pow(10,9);
            
//         }
      
       if(i==0)
        {
            if(k%a[i]==0) return k/a[i];
            else
            return(int)Math.pow(10,9);      // we use 1e9 instead of MAX_VALUE    bcz if we add 1 to MAX_VAL  it become overflow
            
        }
     
        if(dp[i][k]!=-1) return dp[i][k];
        int aa=solve(i-1,k,a,dp);
        int b=Integer.MAX_VALUE;
        if(k>=a[i])
        b=1+solve(i,k-a[i],a,dp);
     //   System.out.println(Math.min(aa,b));
        return dp[i][k]=Math.min(aa,b);
    }

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int dp[][]=new int[M][V+1];
         for(int x[]:dp)
         Arrays.fill(x,-1);
	    
	    int ans= solve(M-1,V,coins,dp);
	    if(ans>=(int)Math.pow(10,9))
	    return -1;
	    else
	    return ans;
	} 
}
