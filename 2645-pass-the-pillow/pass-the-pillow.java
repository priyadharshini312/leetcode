class Solution {
    public int passThePillow(int n, int time) {
        /*int sum=0;
        int j=2;
        int prefix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+j;
            j++;
        }
        for(int i=0;i<prefix.length;i++){
            sum+=prefix[i];
        }
        return sum/time;*/
        int start=1;
        int dir=1;
        for(int i=1;i<=time;i++){
             if(start==n){
                dir=-1;
             }
             else if(start==1){
                dir=1;
             }
             start+=dir;
        }
        return start;
    }
}