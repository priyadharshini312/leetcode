class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int n:nums){
            int r=n%3;
            if(r==1)count++;
            else if(r==2)count++;
        }
        return count;
    }
}