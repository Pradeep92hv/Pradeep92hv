https://www.codingninjas.com/codestudio/problems/frog-jump_3621012


import java.util.* ;
import java.io.*; 
public class Solution {
    
   static int solve(int n, int []a, int []dp)
   {
       if(n==0)return 0;
       if(dp[n]!=-1)return dp[n];
      int step2=Integer.MAX_VALUE;
       int step1=solve(n-1,a,dp)+Math.abs(a[n]-a[n-1]);
       if(n>1)
       step2=solve(n-2,a,dp)+Math.abs(a[n]-a[n-2]);
       
       dp[n]=Math.min(step1,step2);
       
       return dp[n];
   }
    public static int frogJump(int n, int heights[]) {
         int dp[]=new int[n];
  //Arrays.fill(dp,-1);
        Arrays.fill(dp,-1);
     
      return  solve(n-1,heights,dp);
    }

}
