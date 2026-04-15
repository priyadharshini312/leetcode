class Solution {
    public double[] internalAngles(int[] sides) {
        int a=sides[0];
        int b=sides[1];
        int c=sides[2];
        if(a+b<=c||a+c<=b||b+c<=a)
        {
            return new double[0];
        }
        double[] ans=new double[3];
        ans[0]=Math.toDegrees(Math.acos(clamp((b*b+c*c-a*a)/(2.0*b*c))));
        ans[1]=Math.toDegrees(Math.acos(clamp((a*a+c*c-b*b)/(2.0*a*c))));
        ans[2]=Math.toDegrees(Math.acos(clamp((a*a+b*b-c*c)/(2.0*a*b))));
        Arrays.sort(ans);
        return ans;
    }
    private double clamp(double x)
    {
        if(x>1)return 1;
        if(x<-1)return -1;
        return x;
    }
}


       