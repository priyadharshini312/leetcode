class Solution {
    public String winningPlayer(int x, int y) {
        /*int a=x*75;
        int b=y*10;
        int total=a+b;
        String aa="";
        while(total>115){
                if(a-75>=0 && b-40>=0){
                    aa="alice";
                    a=a-75;
                    b=b-40;
                    total=total-115;
                }
                if(a-75>=0 && b-40>=0){
                    aa="bob";
                    a=a-75;
                    b=b-40;
                    total=total-115;
                }
        }
        if(aa=="alice"){
            return "Alice";
        }
        return "Bob";*/
        int min=Math.min(x,y/4);
        if(min%2==0){
            return "Bob";
        }
        return "Alice";
    }
}