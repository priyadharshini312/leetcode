class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1=0;
        int sum2=0;
        /*int count1=0,count2=0;
        if(player1[0]!=10){
            sum1=player1[1];
        }
     for(int i=2;i<player1.length;i++){
        if(player1[i-1]!=10 && player1[i-2]!=10){
            sum1+=player1[i];
        }
        else if(player1[i]==10 && count1<1){
            count1++;
            sum1+=player1[i];
        }
        else{
            sum1+=player1[i]*2;
        }
     }
      if(player2[0]!=10){
            sum2+=player2[1];
        }
     for(int i=2;i<player2.length;i++){
        if(player2[i]!=10 && player2[i-2]!=10){
            sum2+=player2[i];
        }
        else if(player2[i]==10 && count2<1){
            count2++;
            sum2+=player2[i];
        }
        else{
            sum2+=player2[i]*2;
        }
     }
     
     
     return sum1==sum2?0:Math.abs(sum1-sum2);
    }
}
List<Integer> list1=new ArrayList();
for(int i=0;i<player1.length;i++){
    list1.add(player1[i]);
}
List<Integer> list2=new ArrayList();
for(int i=0;i<player2.length;i++){
    list2.add(player2[i]);
}
if(!list1.contains(10)){

}*/
for(int i=0;i<player1.length;i++){
    if((i>=1 && player1[i-1]==10)||(i>=2 && player1[i-2]==10)){
        sum1+=player1[i]*2;
    }
    else{
        sum1+=player1[i];
    }
}
for(int i=0;i<player2.length;i++){
    if((i>=1 && player2[i-1]==10)||(i>=2 && player2[i-2]==10)){
        sum2+=player2[i]*2;
    }
    else{
        sum2+=player2[i];
    }
}
int max=0;
if(sum1>sum2){
    max=1;
}
else{
    max=2;
}
return sum1==sum2?0:max;
    }
}