class Solution {
    public boolean rotateString(String s, String goal) {
        int n=1;
        if(s.equals(goal)){
            return true;
        }
        while(n<s.length()){
            String m="";
        for(int i=n;i<s.length();i++){
            m+=s.charAt(i);
        }
        for(int i=0;i<n;i++){
            m+=s.charAt(i);
        }
        if(m.equals(goal)){
            return true;
        }
        else{
            n++;
        }
        }
        return false;
    }
}