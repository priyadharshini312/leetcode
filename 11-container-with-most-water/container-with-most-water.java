class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int breadth=right-left;
            int heigh=Math.min(height[left],height[right]);
            int area=breadth*heigh;
            max=Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return max;
    }
}