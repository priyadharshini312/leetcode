class Solution {
    public int minimumChairs(String s) {
         int e=0,l=0;
         int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                 e++;
             }
        
            else{
                e--;
            }
          max=Math.max(max,e);
        }
        return max;
    }
}