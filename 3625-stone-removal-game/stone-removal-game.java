class Solution {
    public boolean canAliceWin(int n) {
        /*if(n>10 && n-10<9){
            return true;
        }*/
        if(n<10){
            return false;
        }
        boolean alice=true;
        int num=n-10;
        int count=1;
        int val=9;
        while(num>=val){
            if(count%2==0){
                alice=true;
                num=num-val;
                val=val-1;
            }
            else{
                num=num-val;
                val=val-1;
                alice=false;
            }
            count++;

            
        }
        return alice;
    }
}