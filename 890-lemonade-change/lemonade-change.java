class Solution {
    public boolean lemonadeChange(int[] bills) {
        List<Integer> list= new ArrayList();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                list.add(5);
            }
            else if(bills[i]==10){
               if(list.contains(5)){
                list.remove(Integer.valueOf(5));
                list.add(10);
            }
            else{
                return false;
                
            }
            }
            else if(bills[i]==20){
                if(list.contains(5) && list.contains(10)){
                    list.remove(Integer.valueOf(5));
                    list.remove(Integer.valueOf(10));
                    list.add(20);
                }
                else if(Collections.frequency(list,5)>=3){
                    int count=0;
                    for(int j=0;j<list.size();j++){
                        if(list.get(j)==5 && count<3){
                            list.remove(list.get(j));
                            count++;
                        }
                    }
                    list.add(20);
                }
                else{
                    return false;

                }
            }
        }
                return true;
    }
}