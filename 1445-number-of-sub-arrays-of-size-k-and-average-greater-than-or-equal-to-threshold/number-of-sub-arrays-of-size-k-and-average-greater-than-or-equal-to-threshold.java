class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int total=0;
        int count=0;
        for(int i=0;i<k;i++){
            total+=arr[i];
        }
        if(total/k>=threshold){
            count=1;
        }
        for(int i=k;i<arr.length;i++){
            int sum=0;
            sum=total+arr[i]-arr[i-k];
            total=sum;
            if(total/k>=threshold){
                count++;
            }
        }
        return count;

    }
}