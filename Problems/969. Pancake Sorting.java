// Time Complexity:O(n^2)

import java.util.*;
class Solution {
    public List<Integer> pancakeSort(int[] A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int cnt = A.length;
        
        for(int i = 0; cnt>=0; i++, cnt--){
            int n = -1,max = -1;
            for(int j = 0 ;j< cnt; j++){
                if(max<A[j]){
                    max = A[j];
                    n = j;
                }
            }
            //System.out.println(max + "   " + n);
            if(cnt==n+1)
                continue;
            if(n>0){
                A = reverse(A,n+1);
                list.add(n+1);
            }
            A = reverse(A,cnt);
            list.add(cnt);
        }
        
        return list;
    }
    
    private int[] reverse(int []a,int n){
        int i=0;
        int j = n-1;
        while(i<j){
            int temp;
            temp = a[i];
            a[i] =a[j];
            a[j]=temp;
            i++;j--;
        }
        return a;
    }
    
}
