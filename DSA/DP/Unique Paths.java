

https://www.codingninjas.com/codestudio/problems/total-unique-paths_1081470?leftPanelTab=0



import java.util.* ;
import java.io.*; 
public class Solution {
    static int solve(int i,int j, int dp[][] )
    
    {
        if(i==0 && j==0 )
            return dp[i][j]=1;
        if(i<0 || j<0)  return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=solve(i-1,j,dp);
        int left=solve(i,j-1,dp);
        
        return dp[i][j]=up+left;
    }	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int  dp[][]=new int[m][n];
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return solve(m-1,n-1,dp);
	}
}




tabulation



import java.util.* ;
import java.io.*; 
public class Solution {

 	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int  dp[][]=new int[m][n];
       
      
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up=0,left=0;
                if(i==0 && j==0) dp[i][j]=1;
                else
                {
                   if(i>0) up=dp[i-1][j];
                   if(j>0) left=dp[i][j-1];
                     dp[i][j]=up+left; 
                }
                   
            }
        }
        return dp[m-1][n-1];
	}
}
