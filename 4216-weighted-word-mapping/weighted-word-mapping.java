class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        List<Integer> list=new ArrayList();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<weights.length;i++){
            map.put((char)('a'+i),weights[i]);
        }
        char[]arr=new char[26];
        for(int i=0;i<26;i++){
            arr[i]=(char)('a'+i);
        }
        for(String val:words){
            int sum=0;
            for(int i=0;i<val.length();i++){
                sum+=map.get(val.charAt(i));
            }
            list.add(sum%26);
        }
        String m="";
        for(int i=0;i<list.size();i++){
            m+=arr[Math.abs(list.get(i)-25)];
        }
        return m;
    }
}
