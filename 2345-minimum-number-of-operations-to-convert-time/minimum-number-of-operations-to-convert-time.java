class Solution {
    public int convertTime(String current, String correct) {
        int hours=Integer.parseInt(current.substring(0,2));
        int min=Integer.parseInt(current.substring(3,5));
        int hour=Integer.parseInt(correct.substring(0,2));
        int mins=Integer.parseInt(correct.substring(3,5));
        int val=hours*60+min;
        int vals=hour*60+mins;
        int diff=vals-val;
        int count=0;
        while(diff>0){
         if(diff>=60){
            diff=diff-60;
            count++;
        }
        else if(diff>=15){
            diff=diff-15;
            count++;
        }
        else if(diff>=5){
            diff=diff-5;
            count++;
        }
        else if(diff>=1){
            diff=diff-1;
            count++;
        }
        }
        return count;

    }
}