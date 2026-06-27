class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=back(s);
        String s2=back(t);
        return s1.equals(s2);
    }
        public String back(String val){ 
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<val.length();i++){
                if(val.charAt(i)=='#'){
                    if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                    }
                }
                else{
                    sb.append(val.charAt(i));
                }
            }
            return sb.toString();
        }
}