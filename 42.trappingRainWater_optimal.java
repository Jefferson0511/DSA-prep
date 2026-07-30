class Solution {
    public int trap(int[] height) {
        int leftmax[]=new int[height.length];
        int rightmax[]=new int[height.length];
        int maxleft=0;
        int maxright=0;
        int total=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>maxleft){
                maxleft=height[i];
            }
            leftmax[i]=maxleft;
        }
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>maxright){
                maxright=height[i];
            }
            rightmax[i]=maxright;
        }

        for(int i=0;i<height.length;i++){
            total+= Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return total;
    }
}