class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        /*int count=1;
        int j=0;
        int i=0;
        while(i<nums.size() && j<nums.size()-1){
            if(nums.get(j)>nums.get(j+1)){
                count=1;
                i++;
                j=i;
                }
                count++;
                j++;
                if(count==k{
                    found=1;
                }
        }
        return false;*/
        if(k==1){
            return true;
        }
       
        int b=0;
        while(b<=nums.size()-2*k){
            int count1=1;
            int a=b+k;
        for(int i=b;i<b+k-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                 break;
            }
            else{
                count1++;
            }
        }
        int count2=1;
        for(int j=a;j<a+k-1;j++){
            if(nums.get(j)>=nums.get(j+1)){
                 break; 
            }
            else{
                count2++;
            }
        }
        if(count1== k && count2==k){
            return true;
        }
        b++;
    }
        return false;
    }
}