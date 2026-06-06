class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int m=0,r=0,l=0;
        String max="";
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                r++;
            }
            else if(moves.charAt(i)=='L'){
                l++;
            }
        }
        if(r>l){
            max="R";
        }
        else{
            max="L";
        }
        moves=moves.replace("_",max);
        for(char c:moves.toCharArray()){
            if(c=='R'){
                m++;
            }
            else{
                m--;
            }
        }
        return Math.abs(m);
    }
}