class Solution {
    public int findLUSlength(String a, String b) {
        if(!a.contains(b)||!b.contains(a)){
            if(a.length()>b.length()){
                return a.length();
            }
            else{
                return b.length();
            }
        }
        return -1;
    }
}