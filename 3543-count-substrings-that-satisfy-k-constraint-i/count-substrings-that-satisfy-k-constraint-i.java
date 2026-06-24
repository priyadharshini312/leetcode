class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        String m="";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                m=s.substring(i,j+1);
                int one=0,zero=0;
                for(int l=0;l<m.length();l++){
                    
                    if(m.charAt(l)=='1'){
                        one++;
                    }
                    else{
                        zero++;
                    }
                }
                    if(one<=k ||zero<=k){
                         count++;
                    }
                }
            }
        
        return count;
    }
}