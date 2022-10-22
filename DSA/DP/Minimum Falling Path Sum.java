
https://www.codingninjas.com/codestudio/problems/minimum-falling-path-sum_893012?leftPanelTab=1

import java.util.* ;
import java.io.*; 
public class Solution {
    static int getMaxUtil(int i, int j, int m,ArrayList<ArrayList<Integer>>matrix,int[][] dp){
    
    // Base Conditions
    if(j<0 || j>=m)
        return (int)Math.pow(10,9);
    if(i==0)
        return matrix.get(0).get(j);
    
    if(dp[i][j]!=-1) return dp[i][j];
    
    int up = matrix.get(i).get(j) + getMaxUtil(i-1,j,m,matrix,dp);
    int leftDiagonal = matrix.get(i).get(j) + getMaxUtil(i-1,j-1,m,matrix,dp);
    int rightDiagonal =matrix.get(i).get(j) + getMaxUtil(i-1,j+1,m,matrix,dp);
    
    return dp[i][j]= Math.min(up,Math.min(leftDiagonal,rightDiagonal));
    
    }
	static int minFallingPathSum(ArrayList<ArrayList<Integer>> matrix, int n) {
		 
    
    int dp[][]= new int[n][n];
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    int maxi = Integer.MAX_VALUE;
    
    for(int j=0; j<n;j++){
        int ans = getMaxUtil(n-1,j,n,matrix,dp);
        maxi = Math.min(maxi,ans);
    }
    
    return maxi;
	}
}
