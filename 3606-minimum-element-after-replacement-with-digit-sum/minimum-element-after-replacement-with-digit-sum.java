class Solution {
    public int minElement(int[] nums) {
        int i=0;
        int arr[]=new int[nums.length];
        for(int n:nums){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit;
                n=n/10;
            }
            arr[i]=sum;
            i++;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}