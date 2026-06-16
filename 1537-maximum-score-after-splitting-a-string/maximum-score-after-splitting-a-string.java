class Solution {
    public int maxScore(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
    int one=count;
    int zero=0;
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='1'){
            one--;
        }
        else{
            zero++;
        }
        max=Math.max(max,one+zero);
    }
    return max;
    }
}