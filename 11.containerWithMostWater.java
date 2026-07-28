class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int min_height=0;
        int area=0;
        while(i<j){
            min_height= Math.min(height[i],height[j]);
            int width=j-i;
            
            if(min_height==height[i]){
                i++;
            }
            else if(min_height==height[j]){
                j--;
            }
            area= Math.max(min_height*width,area);
        }
        return area;
    }
}