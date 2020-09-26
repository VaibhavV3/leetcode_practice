// This is a DP solution where to calculate no. of unique paths we depend on right and down cells.
//Time Complexity: O(m*n) and Space Complexity: O(m*n)


class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
            dp[i][n-1]=1;
        for(int i=0;i<n;i++)
            dp[m-1][i]=1;
        for(int i=m-2;i>=0;i--)
            for(int j=n-2;j>=0;j--)
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
        
        return dp[0][0];
    }
}

// Approach 2:
// this approach is mathematical one, so if there is matrix of size m*n
// then it means, there are total m-1 decisions where we chose to go on right, and n-1 decisions where we chose to go on down.
// also total path length will always be, m+n-2
// so using concept of probability, answer of the program will be (m+n-2)!/((m-1)!*(n-1)!)
