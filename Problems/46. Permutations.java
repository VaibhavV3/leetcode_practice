//Another Classic problem of backtracking.

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result= new ArrayList<List<Integer>>();
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int n:nums){
            data.add(n);
        }
        compute(data,new ArrayList<Integer>());
        return result;
    }
    
    private void compute(ArrayList<Integer> data , List<Integer> list){
        int cnt=0;
        for(int i=0;i<data.size();i++){
            Integer n=data.get(i);
            if(n!=null){
                data.set(i,null);
                //System.out.println(n+" "+data);
                list.add(n);
                compute(data,list);
                list.remove(new Integer(n));
                data.set(i,n);
            }else{
                cnt++;
            }
        }
        if(cnt==data.size()){
            result.add(new ArrayList<Integer>(list));
        }
    }
}
