class Solution {
    public int integerReplacement(int n) {
        int count=0;
        long nn=n;
        while(nn!=1){
        if(nn%2==0){
            nn=nn/2;
           
        }
        else if(nn==3 || nn%4==1){
            nn=nn-1;
        }
        else{
            nn=nn+1;
        }
        count++;

        }
          return count;
    }
}