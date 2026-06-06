class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,l=0,r=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                u++;
            }
            else if(c=='R'){
                r++;
            }
            else if(c=='L'){
                l++;
            }
            else{
                d++;
            }
        }
        if(u==d && r==l){
            return true;
        }
        return false;
    }
}