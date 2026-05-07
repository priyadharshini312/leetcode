class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map =new HashMap<>();
        for(char ch:magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!map.containsKey(ransomNote.charAt(i))||map.get(ransomNote.charAt(i))==0){
                     return false;
            }
            map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
        }
        return true;
    }
}