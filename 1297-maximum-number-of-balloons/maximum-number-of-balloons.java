class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'||text.charAt(i)=='o'||text.charAt(i)=='n'){
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }
        if(map.size()<5){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(char c:map.keySet()){
            if(c=='l'||c=='o'){
                min=Math.min(min,map.get(c)/2);
            }
            else{
                min=Math.min(min,map.get(c));
            }
        }
        return min==Integer.MIN_VALUE?0:min;
    }
}