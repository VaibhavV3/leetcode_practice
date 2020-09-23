// building max/min heap takes O(n) time
// and getting max/min and rearranging takes O(log n) time
// complete solution below is based on same concept.
// Time Complexity, Best case: O(n) and worst case O(nlog n)
class Solution {
    ArrayList<Node> nodes;
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Node> hm =new HashMap<Integer,Node>();
        for(int n:nums)
            if(hm.containsKey(n)){
                Node node=hm.get(n);
                node.freq=node.freq+1;
            }else
                hm.put(n,new Node(n,1));
        
        nodes = new ArrayList<Node>(hm.values());
        
        int len=nodes.size();
        
        buildHeap(len);
        
        int[] res=new int[k];
        int i=0;
        while(k>0){
            res[i]=nodes.get(0).num;
            deleteMax(len--);
            i++;
            k--;
        }
        
        return res;
    }
    
    public void deleteMax(int len){
        if(len==0)
            return;
        nodes.set(0,nodes.get(len-1));
        len--;
        heapIfy(len,0);
    }
    
    public void heapIfy(int len, int i){
        while(i<len/2){
            int ind=2*(i+1);
            int largest=i;
            if(ind<len && nodes.get(i).freq<nodes.get(ind).freq){
                largest=ind;
            }
            
            ind--;
            
            if(ind<len && nodes.get(largest).freq<nodes.get(ind).freq){
                largest=ind;
            }
            
            if(largest==i)
                break;
            else{
                Node temp;
                temp=nodes.get(largest);
                nodes.set(largest,nodes.get(i));
                nodes.set(i,temp);
            }
            
            i=largest;
        }
    }
    
    public void buildHeap(int len){
        if(len==0)
            return;
        int i = len/2 -1;
        while(i>=0){
            heapIfy(len,i);
            i--;
        }
    }
    
    class Node{
        int freq,num;
        Node(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
}
