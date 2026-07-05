class Solution {
    public int maxDigitRange(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int num=n;
            while(num>0){
                int digit=num%10;
                max=Math.max(max,digit);
                min=Math.min(min,digit);
                num/=10;
            }
            map.put(n,max-min);
        }
        int valmax=Integer.MIN_VALUE;
        for(int val:map.values()){
            if(val>valmax){
                valmax=val;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==valmax){
                sum+=nums[i];
            }
        }
        return sum;
    }
}