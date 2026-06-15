class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int first=0,second=0;
        long volume=(long)height*length*width;
        if((length>=10000||width>=10000||height>=10000)||(volume)>=1000000000){
            first++;
        }
        if(mass>=100){
            second++;
        }
        if(first==1 && second==1){
            return "Both";
        }
        else if(first==1 && second!=1){
            return "Bulky";
        }
        else if(second==1 && first!=1){
            return "Heavy";
        }
        
            return "Neither";
    }
}