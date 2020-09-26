// Time Complexity: O(m+n) and Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int m=matrix.length,n=matrix[0].length;
        //System.out.println(m+" "+n);
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target)
                return true;
            if(target<matrix[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
}
