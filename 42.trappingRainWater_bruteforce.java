class Solution {
    public int trap(int[] height) {
        int total=0;
        
        for(int i=0;i<height.length;i++){
            int maxleft=0;
            int maxright=0;
            for(int j=i;j>=0;j--){
                if(height[j]>maxleft){
                    maxleft=height[j];
                }
            }
            for(int j=i;j<height.length;j++){
                if(height[j]>maxright){
                    maxright=height[j];
                }
            }
            total += Math.min(maxleft,maxright)-height[i];
        }
        return total;
    }
}