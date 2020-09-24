class Solution {
    public String toLowerCase(String s) {
        StringBuffer sb=new StringBuffer();
        int sLen=s.length();
        for(int i=0;i<sLen;i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch-'A'+'a');
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
