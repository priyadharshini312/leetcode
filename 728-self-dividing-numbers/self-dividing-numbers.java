class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList();
        for(int i=left;i<=right;i++){
            int count=0;
            int n=i;
            if(n/10==0){
                list.add(i);
            }
            else{
               while(n>0){
                 
                int digit=n%10;
                if(digit!=0){
                if(i%digit==0){
                    count++;
                }
                }
                n/=10;
            }
            if(count==String.valueOf(i).length()){
                list.add(i);
            }
        }
        }
        return list;
    }
}