class Solution {
    public String mergeAlternately(String word1, String word2) {
        String m="";
        int n=0;
        if(word1.length()<word2.length()){
            n=word1.length();
        }
        else{
            n=word2.length();
        }
        for(int i=0;i<n;i++){
             m+=word1.charAt(i);
             m+=word2.charAt(i);
        }
        if(n==word1.length()){
            m+=word2.substring(n,word2.length());
        }
        else{
            m+=word1.substring(n,word1.length());
        }
        return m;
    }
}