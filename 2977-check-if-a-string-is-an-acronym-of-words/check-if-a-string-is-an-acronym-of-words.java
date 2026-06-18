class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String m="";
        for(String ss:words){
            m+=ss.substring(0,1);
        }
        if(m.equals(s)){
            return true;
        }
        return false;
    }
}