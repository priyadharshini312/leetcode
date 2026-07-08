class Solution {
    public int distMoney(int money, int children) {
        
        if(money<children){
            return -1;
        }
        int m=money-children;
        int result=Math.min(m/7,children);
        int rem=m-result*7;
        if(result==children && rem>0){
            result--;
        }
        else if(result==children-1 && rem==3){
            result--;
        }
        return result;
        
    }
}