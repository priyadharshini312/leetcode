class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!sb.toString().contains(String.valueOf((s.charAt(i))))){
                sb.append(s.charAt(i));
            }
            else if(sb.length()>0){
                if(sb.charAt(sb.length()-1)==s.charAt(i)){
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}