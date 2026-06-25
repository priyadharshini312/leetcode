class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        /*int count=0;
        for(int i=0;i<students.length;i++){
            if(students[i]!=sandwiches[i]){
                count++;
            }
        }
        if(count%2==0){
            return 0;
        }
        return count;*/
        List<Integer> list= new ArrayList();
        for(int i=0;i<students.length;i++){
            list.add(students[i]);
        }
        List<Integer> list1= new ArrayList();
        for(int i=0;i<sandwiches.length;i++){
            list1.add(sandwiches[i]);
        }
        //for(int i=0;i<list.size();i++){
            //for(int j=0;j<list1.size();j++){
            int count=0;
            while(!list.isEmpty() && !list1.isEmpty()){
               int i=0,j=0;
                if(list.get(i)==list1.get(j)){
                    list.remove(i);
                    list1.remove(j);
                    count=0;
                }
                else{
                    int val=list.get(i);
                    list.remove(i);
                    list.add(val);
                    count++;
                }
                
                if(count==list.size()){
                    break;
                }
            }
        return list.size();
    }
}