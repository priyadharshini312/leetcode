class Solution {
    public List<List<Integer>> generate(int numRows) {
        int sum=0;
        List<List<Integer>> result =new ArrayList();
        for(int i=1;i<=numRows;i++){
            List<Integer> list=new ArrayList();
             for(int j=0;j<i;j++){
                   if(j==0||j==i-1){
                      list.add(1);
                   }
                   else{
                    List<Integer> prev= result.get(i-2);
                    list.add(prev.get(j-1)+prev.get(j));

                   }
            }
            
              result.add(list);
            }
        
        return result;
    }
}