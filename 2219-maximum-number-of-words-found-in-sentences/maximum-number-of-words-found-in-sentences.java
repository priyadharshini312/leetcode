class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(String s:sentences){
            String arr[]=s.split(" ");
            max=Math.max(max,arr.length);
        }
        return max;
    }
}