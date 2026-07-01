class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int index=0;
        int max=events[0][1];
        int val=events[0][0];
        int diff=0;
        for(int i=1;i<events.length;i++){
              diff=events[i][1]-events[i-1][1];
              if(max<diff){
                max=diff;
                val=events[i][0];
              }
              if(max==diff){
                max=diff;
                val=Math.min(val,events[i][0]);
              }

        }
        return val;
    }
}