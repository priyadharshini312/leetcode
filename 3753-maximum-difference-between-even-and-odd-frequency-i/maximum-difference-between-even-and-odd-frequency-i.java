class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for(char ch:c){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int even=0,odd=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
         for(int value:map.values()){
            if(value%2==0 && value<min){
                min=value;
                even=value;
            }
            else if(value%2!=0 && value>max){
                max=value;
                odd=value;
            }
         }
         return odd-even;
    }
}