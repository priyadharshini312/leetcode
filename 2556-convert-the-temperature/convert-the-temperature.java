class Solution {
    public double[] convertTemperature(double celsius) {
        ArrayList<Double> list=new ArrayList<>();
        list.add(celsius+273.15);
        list.add(celsius*1.80+32.00);
        double ans[]=new double[list.size()];
        for(int i=0;i<ans.length;i++){
               ans[i]=list.get(i);
        }
        return ans;
        
    }
}