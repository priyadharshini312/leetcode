class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] c=s.toCharArray();
        char[] d=t.toCharArray();
        int m=0;
        int first=0;
        for(int i=0;first<c.length && i<d.length;i++){
           if(c[first]==d[i]){
            first++;
           }
        }
        return first==c.length;
        }
    }