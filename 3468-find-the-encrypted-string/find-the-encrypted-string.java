class Solution {
    public String getEncryptedString(String s, int k) {
        String m="";
        for(int i=0;i<s.length();i++){        
            if(k+i<s.length()){
                m+=s.charAt(k+i);
            }
            else{
                int n=k+i;
                m+=s.charAt(n%s.length());
            }
        }
        return m;
       
    }
}