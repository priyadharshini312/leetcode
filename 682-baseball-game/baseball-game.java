class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList();
        for(String c:operations){
            
            if(c.equals("C")){
                list.remove(list.size()-1);
            }
            else if(c.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }
            else if(c.equals("+")){
               list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else{
                int n=Integer.parseInt(c);
                list.add(n);
            }
           

        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}