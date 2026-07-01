class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int index=0;
        int max=events[0][1];
        int ans=events[0][0];
        for(int i=1;i<events.length;i++){
              int diff=events[i][1]-events[i-1][1];
              int val=events[i][0];
              if(max<diff){
                max=diff;
                ans=val;
              }
              if(max==diff && val<ans){
                max=diff;
                ans=val;
              }

        }
        return ans;
    }
}