class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*int n=nums.length-k;
        int a=0;
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int max=Integer.MIN_VALUE;
            if(i==n){
                for(int l=i;l<nums.length;l++){
                    max=Math.max(max,nums[l]);
                }
            }
            else{
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            }
            arr[a++]=max;
        }
        return arr;
    }
}*/
   Deque<Integer> queue=new LinkedList<>();
   int a=0;
   int n=nums.length-k;
   int arr[]=new int[n+1];
   for(int i=0;i<nums.length;i++){
     while(!queue.isEmpty() && queue.peekFirst()<=i-k){
        queue.pollFirst();
     }
     while(!queue.isEmpty() && nums[queue.peekLast()]<nums[i]){
        queue.pollLast();
     }
     queue.offerLast(i);
     if(i>=k-1){
        arr[a++]=nums[queue.peekFirst()];
     }
   }
   return arr;
    }
}
