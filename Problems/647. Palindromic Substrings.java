// problem is pretty classic..
// every index is assumed as center, and then around this center we go decrementing left and incrementing center and check if it is, palindrome.
// also, a point worth to note is, there could be two types of centers.. one where center is with odd length string. and one where two center points with even length string.
// so that is why, for every single index, we should check strings, through this 2 centers..
// so total no. of iterations in outer loop is, 2*N where N, is length of string.
// Time Complexity: O(n^2) and space Complexity: O(1)



class Solution {
    public int countSubstrings(String s) {
        int cnt=0,center=0,n=s.length();
        int noi=2*n-1;
        for(;center<noi;center++){
            int left=center/2;
            int right= left+ center%2;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                cnt++;
                left--;
                right++;
            }
        }
        return cnt;
    }
}
