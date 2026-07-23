class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        List<Integer>list=new ArrayList();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]){
					if(j==arr2.length-1) {
						list.add(-1);
					}
					else {
						int s=list.size();
						for(int k=j+1;k<arr2.length;k++) {
							if(arr2[k]>arr1[i]) {
								list.add(arr2[k]);
								break;
							}
						}
						if(list.size()==s) {
							list.add(-1);
						}
						
					}
					
				}
			}
			
		}
        int nums[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}