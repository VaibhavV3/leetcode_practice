//Approach 1: iterate over array and try to create a list of those numbers, and overwrite other list.. Refer. https://leetcode.com/problems/longest-increasing-subsequence/solution/ 
// Time Complexity: O(nlogn)

class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int len=0;
        for(int num:nums){
            int i= Arrays.binarySearch(dp,0,len,num);
            //System.out.print(i);
            if(i<0){
                i=-(i+1);
            }
            //System.out.println("  "+i);
            dp[i]=num;
            if(i==len)
                len++;
        }
        return len;
    }
}

//-------------------Approach 2-----------------------
// Time Complexity: O(n^2)
/*
class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int max2=0;
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && max<dp[j])
                    max=dp[j];
            }
            dp[i]=max+1;
            if(max2<dp[i])
                max2=dp[i];
        }
        return max2;
    }
}
*/
