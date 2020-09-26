class Solution {
    public int maxSubArray(int[] nums) {
        int maxHere=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>(maxHere+nums[i])){
                maxHere=nums[i];
            }else{
                maxHere=maxHere + nums[i];
            }
            
            if(max<maxHere)
                max=maxHere;
        }
        return max;
    }
}
