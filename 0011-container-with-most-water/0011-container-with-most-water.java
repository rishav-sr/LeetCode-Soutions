class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right])
            right--;
            else
            left++;
        }
        return area;
        
    }
}