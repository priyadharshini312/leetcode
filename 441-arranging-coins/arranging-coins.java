class Solution {
    public int arrangeCoins(int n) {
        int m=n;
        int count=0;
        
        for(int i=1;i<=n;i++){
            if(m-i>=0){
              m=m-i;
              count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}