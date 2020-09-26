// Both of the below approaches are same
// One is using priority queue (implemented by java) It is same as max-heap
// and other is max-heap implemented from scratch

//---------------------------- Approach-1 --------------------------
class Solution {
    public int findKthLargest(int[] nums, int k) {

    final PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int val : nums) {
        pq.offer(val);

        if(pq.size() > k) {
            pq.poll();
        }
    }
    return pq.peek();
    }
}

//---------------------------- Approach-2 --------------------------
/* 
class Solution {
    int[] nums;
    public int findKthLargest(int[] nums, int k) {
        this.nums=nums;
        int n = nums.length;
        buildMaxHeap(n);
        for(int i=0;i<n;i++)
            System.out.print(this.nums[i]+" ");
        System.out.println("");
        int num=0;
        while(k>0){
            num=this.nums[0];
            this.nums[0]=this.nums[n-1];
            n--;
            k--;
            heapIfy(n,0);
        }
        return num;
    }
    
    private void heapIfy(int len,int i){
        while(i<len/2){
            int largest=i;
            int ind=2*(i+1);
            if(ind<len && nums[ind]>nums[i])
                largest=ind;
            ind--;
            if(ind<len && nums[ind]>nums[largest])
                largest=ind;
            if(largest==i)
                break;
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
            i=largest;
        }
    }

    private void buildMaxHeap(int n){
        int i=n/2 -1;
        while(i>=0){
            heapIfy(n,i--);
        }
    }
}
*/
