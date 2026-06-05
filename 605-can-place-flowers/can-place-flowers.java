class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(flowerbed.length<=1){
            if(flowerbed[0]==0 && n==1){
                count++;
            }
        }
        for(int i=0;i<flowerbed.length && count<n;i++){
            if(i==0||i==flowerbed.length-1){
                if(flowerbed[0]==0 && flowerbed[1]==0 && count<n){
                    flowerbed[0]=1;
                    count++;
                }
                if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0 && count<n){
                flowerbed[flowerbed.length-1]=1;
                count++;
                }
            }
            else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                flowerbed[i]=1;
                count++;
            }
        }
        return count==n?true:false;
    }
}