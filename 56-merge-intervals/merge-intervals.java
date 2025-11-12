class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][];
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merge= new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
           for(int i=1;i<intervals.length;i++){
            int currentstart=intervals[i][0];
            int currentend=intervals[i][1];

        
        if(currentstart<= end){
                   end=Math.max(end,currentend);
        }
        else{
            merge.add(new int[]{start,end});
            start=currentstart;
            end=currentend;

           }
        }
        merge.add(new int[]{start,end});
           return merge.toArray(new int[merge.size()][]);
    }
}