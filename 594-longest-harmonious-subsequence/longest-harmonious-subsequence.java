class Solution {
    public int findLHS(int[] nums) {
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    int one=0,two=0,max=0;
    int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1)){
                one=map.get(nums[i]+1)+map.get(nums[i]);
            }
            if(map.containsKey(nums[i]-1)){
                two=map.get(nums[i])+map.get(nums[i]-1);
            }
            if(one>two){
                max=Math.max(max,one);
            }
            else{
                max=Math.max(max,two);
            }
            res=Math.max(res,max);
        }
        return res;

        }
    }
