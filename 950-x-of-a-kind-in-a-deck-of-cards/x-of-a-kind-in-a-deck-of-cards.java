class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int c:deck){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         int num=0;
         for(int c:map.values()){
            num=gcd(num,c);
         }
            if(num<2){
                return false;
            }
         
         return num>=2;
    }
    public int gcd(int a,int b){
            while(b!=0){
                  int temp=b;
                  b=a%b;
                  a=temp;
            }
            return a;
         }
}