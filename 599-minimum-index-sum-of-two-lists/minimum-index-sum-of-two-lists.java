class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
              int max=Integer.MAX_VALUE;
              int sum=0;
              List<Integer> list=new ArrayList();
              
              for(int i=0;i<list1.length;i++){
                for(int j=0;j<list2.length;j++){
                    if(list1[i].equals(list2[j])){
                        sum=i+j;
                    if(sum<max){
                        max=sum;
                        if(list.size()<1){
                         list.add(i);
                        }
                        else{
                            list.remove(list.size()-1);
                            list.add(i);
                        }
                    }
                    else if(sum==max){
                         list.add(i);
                    }
                    }
                }
              }
              String arr[]=new String[list.size()];
              for(int i=0;i<list.size();i++){
                arr[i]=list1[list.get(i)];
              }
              return arr;
    }
}
