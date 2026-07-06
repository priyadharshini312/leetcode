class Solution {
    public boolean isSubsequence(String s, String t) {
        int f=0;
        int l=0;
        int count=0;
        while(f<s.length() && l<t.length() ){
            if(s.charAt(f)==t.charAt(l)){
                f++;
                count++;
            }
            l++;
        }
        return count==s.length();
    }
}