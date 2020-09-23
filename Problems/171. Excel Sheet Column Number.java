class Solution {
    public int titleToNumber(String s) {
        int sLen=s.length();
        int mul=1,res=0;
        for(int i=sLen-1;i>=0;i--){
            res=res+(mul*(s.charAt(i)-'A'+1));
            mul*=26;
        }
        return res;
    }
}

// what if, A=0 ?? how would you write a code.
