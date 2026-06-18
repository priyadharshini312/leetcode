class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]/10==0){
                list.add(nums[i]);
            }
            else{
                String s=String.valueOf(nums[i]);
                for(int j=0;j<s.length();j++){
                    list.add(Character.getNumericValue(s.charAt(j)));
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}