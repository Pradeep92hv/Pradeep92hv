https://practice.geeksforgeeks.org/problems/path-in-matrix3805/1


class Solution{
    static int getMaxUtil(int i, int j, int m, int[][] matrix,int[][] dp){
    
    // Base Conditions
    if(j<0 || j>=m)
        return (int)Math.pow(-10,9);
    if(i==0)
        return matrix[0][j];
    
    if(dp[i][j]!=-1) return dp[i][j];
    
    int up = matrix[i][j] + getMaxUtil(i-1,j,m,matrix,dp);
    int leftDiagonal = matrix[i][j] + getMaxUtil(i-1,j-1,m,matrix,dp);
    int rightDiagonal = matrix[i][j] + getMaxUtil(i-1,j+1,m,matrix,dp);
    
    return dp[i][j]= Math.max(up,Math.max(leftDiagonal,rightDiagonal));
    
}

    static int maximumPath(int n, int matrix[][])
    {
        // code here
            int dp[][]= new int[n][n];
    for(int row[]: dp)
    Arrays.fill(row,-1);
    
    int maxi = Integer.MIN_VALUE;
    
    for(int j=0; j<n;j++){
        int ans = getMaxUtil(n-1,j,n,matrix,dp);
        maxi = Math.max(maxi,ans);
    }
    
    return maxi;
    }
}
