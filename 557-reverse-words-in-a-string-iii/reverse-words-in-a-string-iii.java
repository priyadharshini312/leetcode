class Solution {
    public String reverseWords(String s) {
        String[]words=s.split(" ");
        String m="";
       for(String c:words){
           for(int i=c.length()-1;i>=0;i--){
              m+=c.charAt(i);
           }
           
           m+=" ";
           
       }
       return m.trim();
    }
}