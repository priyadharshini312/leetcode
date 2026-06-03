class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<landDuration.length;i++){
            min1=Math.min(min1,landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<waterDuration.length;i++){
            int f=Math.max(min1,waterStartTime[i])+waterDuration[i];
            min2=Math.min(min2,f);
        }
        int m1=Integer.MAX_VALUE;
       
        for(int i=0;i<waterDuration.length;i++){
                  m1=Math.min(m1,waterStartTime[i]+waterDuration[i]);
                 
            }

        int m2=Integer.MAX_VALUE;
        for(int i=0;i<landDuration.length;i++){
            int f=Math.max(m1,landStartTime[i])+landDuration[i];
            m2=Math.min(m2,f);
                
            
        }
        return Math.min(min2,m2);
    }
}
    
