class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,max=0,zero=0;
        while(right<nums.length) {
            if(nums[right]==0) {
                zero++;
            }
            if(zero>k)
            {
                if(nums[left]==0)
                zero--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
//[1,1,1,0,0,0,1,1,1,1,0]
//[1,1,1,0,0,0,]