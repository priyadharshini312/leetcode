class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        if(k<=1)
        return 0;
        /*for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int l=0;l<j;l++){
                    if(nums[i]*nums[j]*nums[l]<k){
                        count++;
                    }
                }
            }
        }*/
        /*int left=0;
        int right=1;
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;

            }
        }
        for(int i=0;i<nums.length;i++){
            sum=left*right;
            if(sum<k){
                sum*=right;
                count++;
                right++;
            }
            else{
                sum*=left;
                count++;
                left++;

            }

        }*/
        int left=0;
        int right=0;
        int product=1;
        while(right<nums.length){
            product*=nums[right];
            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}
