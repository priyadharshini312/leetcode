class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m];
        for(int k=0;k<m;k++){
            arr[k]=nums1[k];
        }
        int i=0,j=0;
        int st=0;
        while(i<arr.length && j<nums2.length){
            if(arr[i]==nums2[j]){
                nums1[st++]=arr[i];
                nums1[st++]=nums2[j];
                i++;
                j++;
            }
            else if(arr[i]<nums2[j]){
                nums1[st++]=arr[i];
                i++;
            }
            else if(nums2[j]<arr[i]){
                nums1[st++]=nums2[j];
                j++;
            }
        }
        if(i<m){
            for(int a=i;a<m;a++){
                nums1[st++]=arr[a];
            }
        }
        else if(j<n){
            for(int b=j;b<n;b++){
                nums1[st++]=nums2[b];
            }
        }
        
    }
}