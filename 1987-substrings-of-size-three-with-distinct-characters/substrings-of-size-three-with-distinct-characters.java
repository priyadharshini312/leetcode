class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            List<Character> list= new ArrayList();
            for(int j=i;j<i+3;j++){
                if(!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                }
            }
            if(list.size()==3){
                count++;
            }
        }
        return count;
        
    }
}