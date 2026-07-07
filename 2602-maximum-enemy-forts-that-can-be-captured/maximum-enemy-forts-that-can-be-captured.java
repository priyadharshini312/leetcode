class Solution {
    public int captureForts(int[] forts) {
        /*List<Integer> list=new ArrayList();
        //List<Integer> list2=new ArrayList();
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1){
                list.add(i);
            }
            else if(forts[i]==-1){
                list.add(i);
            }
        }
        int max=Integer.MIN_VALUE;
        Collections.sort(list);
        int s=0;
        int e=1;
        int st=list.get(s);
        int end=list.get(e);
        while(st<list.size()){
            int count=0;
        for(int i=st+1;i<end-1;i++){
            if(forts[i]==0){
                count++;
            }
        }
        max=Math.max(max,count);
        s++;
        e++;
        }
        return max;*/
        int max=Integer.MIN_VALUE;
        int st=-1;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1 && st==-1 || forts[i]==-1 && st==-1){
                  st=i;
            }
            else if(forts[i]==1 && forts[st]==-1){
                max=Math.max(max,(i-st)-1);
                st=i;
            }
            else if(forts[i]==-1 && forts[st]==1){
                max=Math.max(max,(i-st)-1);
                st=i;;
            }
            else if(forts[i]==-1 && forts[st]==-1){
                st=i;
            }
            else if(forts[i]==1 && forts[st]==1){
                st=i;
            }
        }
        return max==Integer.MIN_VALUE?0:max;

    }
}