class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
            set.add(c);
            }
        }
        int count=0;
        for(char ch:set){
            char m=Character.toUpperCase(ch);
            if(word.contains(""+m)){
                count++;
            }
        }
        return count;
    }
}
            