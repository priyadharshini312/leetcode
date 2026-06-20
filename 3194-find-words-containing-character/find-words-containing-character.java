class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList();
        int count=-1;
        for(String s:words){
            count++;
            if(s.contains(String.valueOf(x))){
                list.add(count);
            }
        }
        return list;
    }
}