class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int arr[]=new int[2];
       int a=0;
       int b=0;
        for(int i=0;i<aliceSizes.length;i++){
            a+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            b+=bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                int l=a-aliceSizes[i]+bobSizes[j];
                int o=b-bobSizes[j]+aliceSizes[i];
                if(l==o){
                    arr[0]=aliceSizes[i];
                    arr[1]=bobSizes[j];
                    
                }
            }
        }
        return arr;
    }
}
        