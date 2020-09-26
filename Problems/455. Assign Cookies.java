// Solved with a Greedy Approach
// Time Complexity: O(nlogn)

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=s.length-1;
        for(int i=g.length-1;i>=0 && j>=0;i--){
            //System.out.println(g[i]+" "+s[j]+" "+j);
            if(g[i]<=s[j])
                j--;
        }
        return s.length-j-1;
    }
}
