class Solution {
    public char repeatedCharacter(String s) {
        String m="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                m=String.valueOf(s.charAt(i));
                break;
            }
            map.put(s.charAt(i),i);
        }
        return m.charAt(0);
    }
}