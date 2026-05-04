class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max=Integer.MIN_VALUE;
        int smax=0;
        int tmax=0;
        int index=0;
        String arr[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                tmax=smax;
                smax=max;
                max=score[i];
            }
            else if(score[i]>smax){
                tmax=smax;
                smax=score[i];
            }
            else if(score[i]>tmax){
                tmax=score[i];
            }

            }
            for(int i=0;i<score.length;i++){
                if(score[i]==max){
                    arr[i]="Gold Medal";
                }
                else if(score[i]==smax){
                    arr[i]="Silver Medal";
                }
                else if(score[i]==tmax){
                    arr[i]="Bronze Medal";
                }
            }
            for(int i=0;i<score.length;i++){
                int rank=1;
                  if(score[i]!=max && score[i]!=smax && score[i]!=tmax){
                       for(int j=0;j<score.length;j++){
                           if(score[j]>score[i]){
                             rank++;
                           }
                       }
                        arr[i]=String.valueOf(rank);
                        
                  }
            }
            return arr;
        
    }
}