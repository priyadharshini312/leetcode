class Solution {
    public int thirdMax(int[] nums) {
        Integer max=null;
        Integer smax=null;
        Integer tmax=null;
        for(int num:nums){
            if((max!=null && num==max)||(smax!=null && num==smax)||(tmax!=null && num==tmax)){
                continue;
            }
        
            if(max==null || num>max){
                
                tmax=smax;
                smax=max;
                max=num;
            }
            else if(smax==null || num>smax){
                tmax=smax;
                smax=num;
            }
            else if(tmax==null || num>tmax){
                tmax=num;
            }
        }
        
        return(tmax==null?max:tmax);
    }
}