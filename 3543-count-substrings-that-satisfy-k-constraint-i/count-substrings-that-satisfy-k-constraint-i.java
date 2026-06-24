class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        String m="";
        int count=0;
        for(int i=0;i<s.length();i++){
            int one=0,zero=0;
            for(int j=i;j<s.length();j++){
                
                if(s.charAt(j)=='1'){
                        one++;
                    }
                    else{
                        zero++;
                    }
                    if(one<=k ||zero<=k){
                         count++;
                    }
                }
            }
        
        return count;
    }
}