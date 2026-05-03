class Solution {
    public int sumOfPrimesInRange(int n) {
        int num=n;
        int sum=0;
        int start=n;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        int l=Math.min(start,rev);
        int r=Math.max(start,rev);
        while(l<=r){
            int count=0;
         for(int i=1;i*i<=l;i++){
               if(l%i==0){
                   count++;
                   if(i!=l/i)count++;
               }
         }
            if(count==2){
            sum+=l;
            }
            l++;
        }
        return sum;
        
    }
}