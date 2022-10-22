
https://www.codingninjas.com/codestudio/problems/triangle_1229398?leftPanelTab=0

import java.util.* ;
import java.io.*; 
public class Solution {
    static int solve(int a[][], int n,int i,int j,int dp[][] )
    {
        if(i==n)
            return dp[i][j]=a[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int down=a[i][j]+solve(a,n,i+1,j,dp);
        int side=a[i][j]+solve(a,n,i+1,j+1,dp);
        
        return  dp[i][j]=Math.min(down,side);
    }
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int dp[][]=new int [n][n];
        for(int []x:dp)
            Arrays.fill(x,-1);
     return   solve(triangle,n-1,0,0,dp);
    }
}




import java.util.* ;
import java.io.*; 
public class Solution {

    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int dp[][]=new int [n][n];
      
        for(int i=0;i<n;i++)
            dp[n-1][i]=triangle[n-1][i];
        
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int down=triangle[i][j]+dp[i+1][j];
                
                int side=triangle[i][j]+dp[i+1][j+1];
                
                dp[i][j]=Math.min(down,side);
            }
        }

        return  dp[0][0];
    }
}
