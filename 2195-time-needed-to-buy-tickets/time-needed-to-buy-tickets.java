class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                total+=Math.min(tickets[k],tickets[i]);
            }
            else{
                total+=Math.min(tickets[i],tickets[k]-1);
            }
        }
        return total;
    }
}