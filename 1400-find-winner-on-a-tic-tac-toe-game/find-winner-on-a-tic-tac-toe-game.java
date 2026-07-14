class Solution {
    public String tictactoe(int[][] moves) {
        int a[]=new int[3];
        int a1[]=new int[3];
        int b[]=new int[3];
        int b1[]=new int[3];
        int da=0;
        int oa=0;
        int db=0;
        int ob=0;
        for(int i=0;i<moves.length;i++){
            int r=moves[i][0];
            int c=moves[i][1];
            if(i%2==0){
                a[r]++;
                a1[c]++;
            if(r==c){
                da++;
            }
            if(r+c==2){
                oa++;
            }
            if(a[r]==3||a1[c]==3||da==3||oa==3){
                return "A";
            }
            }
            else{
                b[r]++;
                b1[c]++;
                if(r==c){
                    db++;
                }
                if(r+c==2){
                    ob++;
                }
        
                if(b[r]==3||b1[c]==3||db==3||ob==3){
                    return"B";
                }
            }
        }
        return moves.length==9?"Draw":"Pending";
    }
}