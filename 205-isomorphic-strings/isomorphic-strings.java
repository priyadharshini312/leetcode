class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
        return false;
        }
       
       Map<Character,Character>charSet=new HashMap<>();
       Map<Character,Character>charSet1=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c1=s.charAt(i);
        char c2=t.charAt(i);
       
       
       if(charSet.containsKey(c1)){
        if(charSet.get(c1)!=c2){
            return false;
        }
       }
        else if(charSet1.containsKey(c2)){
            return false;
        }
        else{
            charSet.put(c1,c2);
            charSet1.put(c2,c1);
        }
       }

        
        return true;
      
        
    }
}