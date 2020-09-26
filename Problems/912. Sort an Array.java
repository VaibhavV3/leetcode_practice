//Traditional Merge Sort
// Time Complexity: O(nlog n) and space Complexity: O(n)

class Solution {
    int nums[],dummy[];
    public int[] sortArray(int[] nums) {
        this.nums=nums;
        if(nums.length==1)
            return nums;
        dummy=new int[nums.length];
        mergeSort(0,nums.length-1);
        return nums;
    }
    
    private void mergeSort(int l,int h){
        int mid=(l+h)/2;
        if(l!=mid){
            mergeSort(l,mid);
        }
        
        if(h!=(mid+1)){
            mergeSort(mid+1,h);
        }
        
        int k=l;
        int i=l,j=mid+1;
        while(i<=mid && j<=h){
            if(nums[i]<nums[j]){
                dummy[k]=nums[i];
                i++;
            }else{
                dummy[k]=nums[j];
                j++;
            }
            k++;
        }
        
        if(i==mid+1){
            while(j<=h){
                dummy[k]=nums[j];
                k++;
                j++;
            }
        }else{
            while(i<=mid){
                dummy[k]=nums[i];
                k++;
                i++;
            }
        }
        
        i=l;
        while(i<=h){
            nums[i]=dummy[i];
            i++;
        }
        
    }
    
}
